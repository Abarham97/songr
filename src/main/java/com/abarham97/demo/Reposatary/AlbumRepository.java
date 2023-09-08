package com.abarham97.demo.Reposatary;


import com.abarham97.demo.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AlbumRepository extends  JpaRepository<Album, Long>{



}
