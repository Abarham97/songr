package com.Abarham97.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import repository.AlbumRepository;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class AlbumController {

    @Autowired
     AlbumRepository albumRepository;

//    @GetMapping("/albums")
//    public String listAlbums(Model model) {
//
//        List<Album> albums = Arrays.asList(
//              new Album("Album1", "Artist1", 10, 300, "/images/alubm1.jpg"),
//
//                new Album("Album2", "Artist2", 12, 360, "/images/albume2.jpg"),
//
//                new Album("Album3", "Artist3", 8, 240, "/images/album3.jpg")
//        );
//
//        model.addAttribute("albums", albums);
//        return "album";
//    }
    @GetMapping("/albums")
    public String listAlbums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "album";
    }
    @GetMapping("/album/{id}")
    public String getAlbum(@PathVariable Long id, Model model) {
        Optional<Album> album = albumRepository.findById(id);
        if (album.isPresent()) {
            model.addAttribute("album", album.get());
        } else {
            return "ID is not defines ";
        }
        return "album-details";
    }

    @PostMapping("/albums/add")
    public String addAlbum(@ModelAttribute Album album, Model model) {
        albumRepository.save(album);
        return "redirect:/albums";
    }
    @PostMapping("/album/delete/{id}")
    public String deleteAlbum(@PathVariable Long id, Model model) {
        albumRepository.deleteById(id);
        return "redirect:/albums";
    }

}
