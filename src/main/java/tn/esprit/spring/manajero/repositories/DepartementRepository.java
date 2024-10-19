package tn.esprit.spring.manajero.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.manajero.entities.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement,Integer> {



}
