package tn.esprit.spring.manajero.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.manajero.entities.Universite;

@Repository
public interface UniversiteRepository extends CrudRepository<Universite,Integer> {


}
