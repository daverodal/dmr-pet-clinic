package dmr.spring.dmrpetclinic.repositories;

import dmr.spring.dmrpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
