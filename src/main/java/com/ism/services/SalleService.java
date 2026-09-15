package com.ism.services;

import java.util.ArrayList;

import com.ism.domain.Salle;

public final class SalleService {
    private static ArrayList<Salle> salles = new ArrayList<>();

    private SalleService() {
    }

    public static ArrayList<Salle> getAll() {
        return salles;
    }

    public static void add(Salle nouvelle) {
        salles.add(nouvelle);
    }
}
