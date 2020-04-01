package dmr.spring.dmrpetclinic.services.map;

import dmr.spring.dmrpetclinic.model.Vet;
import dmr.spring.dmrpetclinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void delteById(Long id) {
        super.deleteById(id);
    }
}
