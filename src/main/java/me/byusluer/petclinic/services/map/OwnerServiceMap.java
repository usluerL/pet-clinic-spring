package me.byusluer.petclinic.services.map;

import me.byusluer.petclinic.model.Owner;
import me.byusluer.petclinic.services.CrudService;


import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements CrudService<Owner, Long>{
    @Override
    public Owner save(Owner owner) {
        return super.save( owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }
}
