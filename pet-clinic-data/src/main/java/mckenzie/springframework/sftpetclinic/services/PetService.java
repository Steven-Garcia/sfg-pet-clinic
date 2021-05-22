package mckenzie.springframework.sftpetclinic.services;

import java.util.Set;

import mckenzie.springframework.sftpetclinic.model.Pet;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
