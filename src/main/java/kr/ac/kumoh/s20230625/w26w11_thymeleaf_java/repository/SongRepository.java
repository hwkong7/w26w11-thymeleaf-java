package kr.ac.kumoh.s20230625.w26w11_thymeleaf_java.repository;

import kr.ac.kumoh.s20230625.w26w11_thymeleaf_java.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongRepository {
    List<Song> findAll();
    Optional<Song> findById(int id);
}