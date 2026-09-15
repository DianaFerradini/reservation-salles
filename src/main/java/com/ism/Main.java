package com.ism;

import java.util.ArrayList;

import com.ism.domain.Reservation;
import com.ism.domain.Salle;
import com.ism.services.Initialisation;
import com.ism.services.ReservationService;
import com.ism.services.SalleService;
import com.ism.views.UserView;

public class Main {
    public static void main(String[] args) {
        Initialisation.initSalles();
        Initialisation.initReservations();
        ArrayList<Salle> salles = SalleService.getAll();
        ArrayList<Reservation> reservations = ReservationService.getAll();
        UserView.AfficherSalles(salles);
        UserView.AfficherReservations(reservations);
    }
}