package dmr.spring.dmrpetclinic.services.springdatajpa;

import dmr.spring.dmrpetclinic.model.Owner;
import dmr.spring.dmrpetclinic.repositories.OwnerRepository;
import dmr.spring.dmrpetclinic.repositories.PetRepository;
import dmr.spring.dmrpetclinic.repositories.PetTypeRepository;
import dmr.spring.dmrpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> optionalOwner = ownerRepository.findById(aLong);
        if(optionalOwner.isPresent()){
            return optionalOwner.get();
        }
        return null;
    }

    @Override
    public Owner save(Owner object) {

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void delteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
