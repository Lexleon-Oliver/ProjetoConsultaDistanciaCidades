package com.digitalinnovationone.citiesapi.cities.repository;

import com.digitalinnovationone.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
