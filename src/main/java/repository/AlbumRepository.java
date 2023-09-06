package repository;

import com.Abarham97.songr.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends  JpaRepository<Album, Long>{



}
