package com.digitalinnovationone.citiesapi.resources;

import com.digitalinnovationone.citiesapi.entity.Country;
import com.digitalinnovationone.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryResource {

    private CountryRepository countryRepository;

    public CountryResource(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping
    public List<Country> countries(){
        return countryRepository.findAll();
    }
}
