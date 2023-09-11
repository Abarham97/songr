package com.abarham97.demo.Reposatary;

import com.abarham97.demo.Album;
import com.abarham97.demo.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
