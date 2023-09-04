package com.Abarham97.songr;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

public class AlbumController {
    @GetMapping("/albums")
    public String listAlbums(Model model) {

        List<Album> albums = Arrays.asList(
                new Album("Album1", "Artist1", 10, 300, "image1.jpg"),
                new Album("Album2", "Artist2", 12, 360, "image2.jpg"),
                new Album("Album3", "Artist3", 8, 240, "image3.jpg")
        );

        model.addAttribute("albums", albums);
        return "album-list";
    }
}
