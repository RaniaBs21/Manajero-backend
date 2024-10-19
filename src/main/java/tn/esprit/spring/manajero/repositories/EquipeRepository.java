package tn.esprit.spring.manajero.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.manajero.entities.Equipe;

@Repository
public interface EquipeRepository extends CrudRepository<Equipe,Integer> {



}
