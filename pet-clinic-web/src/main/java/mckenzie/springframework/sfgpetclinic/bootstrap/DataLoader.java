package mckenzie.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mckenzie.springframework.sftpetclinic.model.Owner;
import mckenzie.springframework.sftpetclinic.model.Vet;
import mckenzie.springframework.sftpetclinic.services.OwnerService;
import mckenzie.springframework.sftpetclinic.services.VetService;
import mckenzie.springframework.sftpetclinic.services.map.OwnerServiceMap;
import mckenzie.springframework.sftpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("first");
        owner1.setLastName("last");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("first_num2");
        owner2.setLastName("last_num2");

        ownerService.save(owner2);

        System.out.println("loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("first vet");
        vet1.setLastName("last vet");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("first vet num2");
        vet2.setLastName("last vet num2");
        vetService.save(vet2);

        System.out.println("loaded vets...");

    }
}
