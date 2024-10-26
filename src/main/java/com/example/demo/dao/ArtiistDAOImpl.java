package com.example.demo.dao;

import com.example.demo.entity.Artist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;
@Repository
public class ArtiistDAOImpl implements  ArtistDAO{

    private EntityManager entityManager ;
    @Autowired
    public ArtiistDAOImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Artist> findAll() {
        TypedQuery<Artist> query = entityManager.createQuery("from Artist",Artist.class);
        List<Artist> artists = query.getResultList();
        return artists;

    }

    @Override
    public Artist available(String time) {
        TypedQuery<Artist> query =  entityManager.createQuery("SELECT e FROM Artist e WHERE e.time = :value", Artist.class)
                .setParameter("value", time);
        Artist theArtist = query.getSingleResult();
        return theArtist;


    }

    @Override
    public Artist seatsAvailable(String name) {
        TypedQuery<Artist> query = entityManager.createQuery("select e from Artist e where e.name =:value",Artist.class);
        query.setParameter("value",name);
        Artist theArtist = query.getSingleResult();
        return  theArtist;
    }

    @Override
    public Artist search(String name) {
        TypedQuery<Artist> query = entityManager.createQuery("select e from Artist e where e.name =:value",Artist.class);
        query.setParameter("value",name);
        Artist theArtist = query.getSingleResult();
        return theArtist;
    }
}
