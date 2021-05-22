package mckenzie.springframework.sftpetclinic.services;

import mckenzie.springframework.sftpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
