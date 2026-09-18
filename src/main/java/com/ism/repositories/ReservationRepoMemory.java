package com.ism.repositories;

import java.util.ArrayList;
import java.util.Date;

import com.ism.domain.Reservation;

public class ReservationRepoMemory implements IReservationRepo<Reservation> {
    public ReservationRepoMemory() {
    }

    private ArrayList<Reservation> reservations = new ArrayList<>();

    @Override 
    public boolean save(Reservation object) {
        reservations.add(object);
        return true;
    }

    @Override 
    public ArrayList<Reservation> findAll() {
        return reservations;
    }

    @Override 
    public ArrayList<Reservation> findByDate(Date date) {
        ArrayList<Reservation> byDate = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getDate().equals(date)) {
                byDate.add(reservation);
            }
        }
        return byDate;
    }
}
