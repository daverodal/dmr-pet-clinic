package dmr.spring.dmrpetclinic.services.springdatajpa;

import dmr.spring.dmrpetclinic.model.Owner;
import dmr.spring.dmrpetclinic.model.Vet;
import dmr.spring.dmrpetclinic.repositories.VetRepository;
import dmr.spring.dmrpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {

        return vetRepository.findById(aLong).orElse( null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void delteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
