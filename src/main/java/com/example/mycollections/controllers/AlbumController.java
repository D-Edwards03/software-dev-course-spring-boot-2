package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final List<Album> albums = new ArrayList<>() {{
       add(new Album("Star Line", "Chance The Rapper", 2025, 17));
       add(new Album("Luv 4 Rent", "Smino", 2022, 15));
       add(new Album("Shea Butter Baby", "Ari Lennox", 2019, 12));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumsJson() { return albums; }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """ +
                albumList +
                """
                        </ul>
                    </body>
                """;
    }

}
