package com.digitalinnovationone.citiesapi.repository;

import com.digitalinnovationone.citiesapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
