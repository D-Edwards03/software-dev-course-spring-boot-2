package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Game Night", "John Daley", 2018, 93));
        add(new Movie("Dead Silence", "James Wan", 2007, 89));
        add(new Movie("Friday Night Lights", "Peter Berg", 2004, 118));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() { return movies; }

    @GetMapping("/html")
    public List<Movie> getMoviesHtml() { return movies; }

}
