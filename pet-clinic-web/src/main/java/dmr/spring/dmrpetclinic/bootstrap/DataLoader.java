package dmr.spring.dmrpetclinic.bootstrap;

import dmr.spring.dmrpetclinic.model.Owner;
import dmr.spring.dmrpetclinic.model.Vet;
import dmr.spring.dmrpetclinic.services.OwnerService;
import dmr.spring.dmrpetclinic.services.VetService;
import dmr.spring.dmrpetclinic.services.map.OwnerMapService;
import dmr.spring.dmrpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(){
        ownerService = new OwnerMapService();
        vetService = new VetMapService();

    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runninn!");
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("David");
        owner.setLastName("Rodal");
        ownerService.save(owner);

        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("Doctor");
        v1.setLastName("Petkill");

        vetService.save(v1);
        System.out.println("Done Runnin'");

    }
}
