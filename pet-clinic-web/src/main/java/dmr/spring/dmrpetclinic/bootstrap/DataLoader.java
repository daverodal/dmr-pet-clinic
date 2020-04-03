package dmr.spring.dmrpetclinic.bootstrap;

import dmr.spring.dmrpetclinic.model.*;
import dmr.spring.dmrpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {


        int count = petTypeService.findAll().size();
        if(count == 0){
            loadData();
        }

    }

    private void loadData() {
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
        owner.setAddress("742 Evergreen Terrace");
        owner.setCity("Springfield");
        owner.setTelephone("867-5309");
        ownerService.save(owner);
        Pet davesPet = new Pet();
        davesPet.setPetType(savedCatPetType);
        davesPet.setOwner(owner);
        davesPet.setName("Louis");
        davesPet.setBirthDate(LocalDate.now());
        owner = new Owner();
        owner.setFirstName("Bruce");
        owner.setLastName("TheGoose");
        owner.setLastName("Rodal");
        owner.setAddress("123 Fake Street");
        owner.setCity("Springfield");
        owner.setTelephone("800-325-3535");
        ownerService.save(owner);
        Pet brucesPet = new Pet();
        brucesPet.setPetType(savedMoosePetType);
        brucesPet.setName("bruce's moose");
        brucesPet.setBirthDate(LocalDate.now());
        Set<Owner> owners = ownerService.findAll();


        Vet v1 = new Vet();
        v1.setFirstName("Doctor");
        v1.setLastName("Petkill");

        Speciality killingPetsSpeciality = new Speciality();
        killingPetsSpeciality.setDescription("Killing pets");
        killingPetsSpeciality = specialityService.save(killingPetsSpeciality);

        Speciality hurtingPetsSpeciality = new Speciality();
        hurtingPetsSpeciality.setDescription("Hurting pets");
        hurtingPetsSpeciality = specialityService.save(hurtingPetsSpeciality);

        Speciality makingPetsCry = new Speciality();
        makingPetsCry.setDescription("Making pets cry");
        makingPetsCry = specialityService.save(makingPetsCry);

        killingPetsSpeciality.setDescription("Hurting pets");
        killingPetsSpeciality.setDescription("Making pets Cry");

        v1.getSpecialities().add(killingPetsSpeciality);
        vetService.save(v1);

        v1 = new Vet();
        v1.setFirstName("Doctor");
        v1.setLastName("Petcry");
        v1.getSpecialities().add(makingPetsCry);
        vetService.save(v1);

        System.out.println("Done Runnin'");
    }
}
