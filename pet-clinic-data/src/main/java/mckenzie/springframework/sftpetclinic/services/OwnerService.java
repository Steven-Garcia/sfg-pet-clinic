package mckenzie.springframework.sftpetclinic.services;

import java.util.Set;

import mckenzie.springframework.sftpetclinic.model.Owner;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);
    
    Set<Owner> findAll();
}
