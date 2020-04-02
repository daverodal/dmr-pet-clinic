package dmr.spring.dmrpetclinic.repositories;

import dmr.spring.dmrpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
