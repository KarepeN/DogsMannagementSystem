package com.nithyaClasses.DMS.repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

import com.nithyaClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>{
	
List<Dog> findByName(String name);
}
