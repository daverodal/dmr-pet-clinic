package dmr.spring.dmrpetclinic.bootstrap;

import dmr.spring.dmrpetclinic.model.Owner;
import dmr.spring.dmrpetclinic.model.PetType;
import dmr.spring.dmrpetclinic.model.Vet;
import dmr.spring.dmrpetclinic.services.OwnerService;
import dmr.spring.dmrpetclinic.services.PetTypeService;
import dmr.spring.dmrpetclinic.services.VetService;
import dmr.spring.dmrpetclinic.services.map.OwnerMapService;
import dmr.spring.dmrpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType moose = new PetType();
        cat.setName("moose");
        PetType savedMoosePetType = petTypeService.save(moose);

        System.out.println("Runninn!");
        Owner owner = new Owner();
        owner.setFirstName("David");
        owner.setLastName("Rodal");
        ownerService.save(owner);
         owner = new Owner();
        owner.setFirstName("Bruce");
        owner.setLastName("TheGoose");
        ownerService.save(owner);
        Set<Owner> owners = ownerService.findAll();



        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("Doctor");
        v1.setLastName("Petkill");

        vetService.save(v1);
        System.out.println("Done Runnin'");

    }
}
