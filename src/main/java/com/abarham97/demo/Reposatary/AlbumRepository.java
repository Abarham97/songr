package com.abarham97.demo.Reposatary;


import com.abarham97.demo.Album;
import com.abarham97.demo.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AlbumRepository extends  JpaRepository<Album, Long>{



}
