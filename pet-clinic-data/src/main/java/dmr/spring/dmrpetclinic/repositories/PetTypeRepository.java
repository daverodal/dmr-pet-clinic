package dmr.spring.dmrpetclinic.repositories;

import dmr.spring.dmrpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
