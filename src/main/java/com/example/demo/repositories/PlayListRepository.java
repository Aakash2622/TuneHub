package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Playlist;

public interface PlayListRepository extends JpaRepository<Playlist, Integer> {
      
}
