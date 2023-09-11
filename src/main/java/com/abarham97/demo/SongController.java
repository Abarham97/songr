package com.abarham97.demo;

import com.abarham97.demo.Reposatary.AlbumRepository;
import com.abarham97.demo.Reposatary.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class SongController {

    @Autowired
    SongRepository SongRepository;
    @Autowired
    AlbumRepository albumRepository;
    @GetMapping("/song")
    public String listSong(Model model) {
        List<Song> song = SongRepository.findAll();
        model.addAttribute("song", song);
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "song";
    }

    @GetMapping("/song/{id}")
    public String getSong(@PathVariable Long id, Model model) {


        Optional<Song> song=SongRepository.findById(id);


        if (song.isPresent()) {
            model.addAttribute("song", song.get());
        } else {
            return "ID is not defines ";
        }
        return "Song-details";
    }

    @PostMapping("/song/add")
    public String addSong(@Valid @ModelAttribute Song song,@RequestParam("albumId") Long albumId, BindingResult bindingResult, RedirectAttributes redirectAttributes) {


        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.song", bindingResult);
            redirectAttributes.addFlashAttribute("song", song);
            System.out.println("we are here");
            return "redirect:/song";
        }

        Optional<Album> album = albumRepository.findById(albumId);

        if (album.isPresent()) {

            song.setAlbum(album.get());


            SongRepository.save(song);
        } else {

            return "redirect:/song";
        }

        return "redirect:/song";
    }

    @PostMapping("/song/delete/{id}")
    public String deleteSong(@PathVariable Long id, Model model) {
        SongRepository.deleteById(id);
        return "redirect:/song";
    }
}
