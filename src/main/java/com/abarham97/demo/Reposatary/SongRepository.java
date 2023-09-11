package com.abarham97.demo.Reposatary;

import com.abarham97.demo.Album;
import com.abarham97.demo.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    @Query("SELECT s FROM Song s WHERE s.album.id = :albumId")
    List<Song> findSongsByAlbumId(@Param("albumId") Long albumId);
}
