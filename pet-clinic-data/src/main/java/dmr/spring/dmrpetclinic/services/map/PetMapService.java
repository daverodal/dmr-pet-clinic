package dmr.spring.dmrpetclinic.services.map;

import dmr.spring.dmrpetclinic.model.Pet;
import dmr.spring.dmrpetclinic.services.CrudService;
import dmr.spring.dmrpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public void delteById(Long id) {
        super.deleteById(id);
    }
}
