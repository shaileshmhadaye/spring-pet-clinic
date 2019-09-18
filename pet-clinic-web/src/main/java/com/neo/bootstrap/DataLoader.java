package com.neo.bootstrap;

import model.Owner;
import model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstname("Shailesh");
        owner.setLastname("Mhadaye");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstname("Snehal");
        owner1.setLastname("Shelke");

        ownerService.save(owner1);

        System.out.println("Loaded Owners...........");

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstname("Pooja");
        vet.setLastname("Narvekar");

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setId(2L);
        vet1.setFirstname("Abhishek");
        vet1.setLastname("Kohli");

        vetService.save(vet1);

        System.out.println("Loaded Vets.........");
    }
}
