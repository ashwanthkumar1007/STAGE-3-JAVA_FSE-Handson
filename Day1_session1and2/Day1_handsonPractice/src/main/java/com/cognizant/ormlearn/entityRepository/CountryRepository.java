package com.cognizant.ormlearn.entityRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface  CountryRepository extends JpaRepository<Country, String> {

	List<Country> findByName(String name);

	List<Country> findByNameAndDesc(String name, String desc);

	List<Country> findByDescContains(String desc);

	List<Country> findByDescLike(String desc);
}
