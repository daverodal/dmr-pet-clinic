package dmr.spring.dmrpetclinic.repositories;

import dmr.spring.dmrpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
