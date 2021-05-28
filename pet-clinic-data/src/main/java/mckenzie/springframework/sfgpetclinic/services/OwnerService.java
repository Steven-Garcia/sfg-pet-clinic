package mckenzie.springframework.sfgpetclinic.services;

import mckenzie.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
