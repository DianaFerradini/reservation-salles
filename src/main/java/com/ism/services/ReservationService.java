package com.ism.services;

import java.util.ArrayList;

import com.ism.domain.Reservation;

public final class ReservationService {
    private static ArrayList<Reservation> reservations = new ArrayList<>();

    private ReservationService() {
    }

    public static ArrayList<Reservation> getAll() {
        return reservations;
    }

    public static void add(Reservation nouvelle) {
        reservations.add(nouvelle);
    }
}
