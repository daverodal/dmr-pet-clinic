package dmr.spring.dmrpetclinic.services.map;

import dmr.spring.dmrpetclinic.model.Visit;
import dmr.spring.dmrpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
        || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);

    }

    @Override
    public void delteById(Long aLong) {
        super.deleteById(aLong);
    }
}
