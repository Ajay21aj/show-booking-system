package com.example.demo.controller;

import com.example.demo.dao.ArtistDAO;
import com.example.demo.entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {

    private ArtistDAO artistDAO;
   @Autowired
    public ArtistController(ArtistDAO artistDAO) {
        this.artistDAO = artistDAO;
    }

    @GetMapping("/allShows")
    public List<Artist> shows(){
       return artistDAO.findAll();
    }
    @GetMapping("/available")
    public Artist available(){
       String time = "10am";
       return artistDAO.available(time);
    }
    @GetMapping("/seats")
    public int availbleSeats(){
       String name = "Aks";
       Artist theArtist = artistDAO.seatsAvailable(name);
       return  theArtist.getSeats();
    }
    @GetMapping("/name")
    public String byName(){
       String name = "Pjs";
       Artist theArtist = artistDAO.search(name);
       return theArtist.toString();
    }


}
