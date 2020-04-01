package dmr.spring.dmrpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findByeId(ID id);
    T save(T object);
    void delete(T object);
    void delteById(ID id);
}

