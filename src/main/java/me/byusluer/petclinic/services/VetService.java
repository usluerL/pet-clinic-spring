package me.byusluer.petclinic.services;
import me.byusluer.petclinic.model.Owner;
import me.byusluer.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface VetService  extends CrudService<Vet, Long> {
  Vet findByLastName(String lastName);
}
