package com.Abarham97.songr;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String listAlbums(Model model) {

        List<Album> albums = Arrays.asList(
              new Album("Album1", "Artist1", 10, 300, "/images/alubm1.jpg"),

                new Album("Album2", "Artist2", 12, 360, "/images/albume2.jpg"),

                new Album("Album3", "Artist3", 8, 240, "/images/album3.jpg")
        );

        model.addAttribute("albums", albums);
        return "album";
    }

}
