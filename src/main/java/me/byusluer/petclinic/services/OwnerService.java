package me.byusluer.petclinic.services;

import me.byusluer.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
