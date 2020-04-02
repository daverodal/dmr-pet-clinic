package dmr.spring.dmrpetclinic.repositories;

import dmr.spring.dmrpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
