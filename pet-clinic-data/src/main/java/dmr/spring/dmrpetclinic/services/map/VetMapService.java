package dmr.spring.dmrpetclinic.services.map;

import dmr.spring.dmrpetclinic.model.Speciality;
import dmr.spring.dmrpetclinic.model.Vet;
import dmr.spring.dmrpetclinic.services.CrudService;
import dmr.spring.dmrpetclinic.services.SpecialityService;
import dmr.spring.dmrpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
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
