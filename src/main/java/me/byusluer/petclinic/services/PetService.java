package me.byusluer.petclinic.services;
import me.byusluer.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

}
