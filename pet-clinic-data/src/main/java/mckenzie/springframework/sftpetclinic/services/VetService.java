package mckenzie.springframework.sftpetclinic.services;

import java.util.Set;

import mckenzie.springframework.sftpetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
