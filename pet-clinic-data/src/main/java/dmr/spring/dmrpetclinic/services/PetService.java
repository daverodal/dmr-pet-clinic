package dmr.spring.dmrpetclinic.services;

import dmr.spring.dmrpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService extends CrudRepository<Pet, Long> {
}
