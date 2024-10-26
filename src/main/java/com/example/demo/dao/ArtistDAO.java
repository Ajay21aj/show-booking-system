package com.example.demo.dao;

import com.example.demo.entity.Artist;

import java.util.List;

public interface ArtistDAO {
    List<Artist> findAll();

    Artist available(String time);

    Artist seatsAvailable(String name);

    Artist search(String name);

}
