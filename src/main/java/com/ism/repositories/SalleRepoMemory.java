package com.ism.repositories;

import java.util.ArrayList;

import com.ism.domain.Salle;

public class SalleRepoMemory implements IRepo<Salle> {
    public SalleRepoMemory() {
    }

    private ArrayList<Salle> salles = new ArrayList<>();

    @Override 
    public boolean save(Salle object) {
        salles.add(object);
        return true;
    }

    @Override 
    public ArrayList<Salle> findAll() {
        return salles;
    }
}
