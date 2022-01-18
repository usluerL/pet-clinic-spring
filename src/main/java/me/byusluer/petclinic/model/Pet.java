package me.byusluer.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private Owner owner;
    private LocalDate birthDate;
    private PetType petType;
}
