package model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthdate;

    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthdate) {
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthdate = birthdate;
    }

}
