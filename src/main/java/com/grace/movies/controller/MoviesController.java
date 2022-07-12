package com.grace.movies.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grace.movies.domain.MovieDTO;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @GetMapping("/{id}")
    public MovieDTO findById(@PathVariable Long id){

        MovieDTO movie = new MovieDTO();

        movie.setId(1l);
        movie.setName("Spiderman");
        movie.setYear(2002);
        return movie;
    }

    @GetMapping("")
    public List<MovieDTO> getAll(){

        List<MovieDTO> lstMovies = new ArrayList<>();

        lstMovies.add(new MovieDTO(1l, "Spiderman", 2002));
        lstMovies.add(new MovieDTO(2l, "Batman", 2005));

        return lstMovies;
    }
    
}
