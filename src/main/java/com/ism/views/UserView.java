package com.ism.views;

import java.util.ArrayList;

import com.ism.domain.Reservation;
import com.ism.domain.Salle;

public final class UserView {
    private UserView() {
    }

    public static void AfficherSalles(ArrayList<Salle> salles) {
        if (salles.isEmpty()) {
            System.out.println("Pas de salles enregistrées");
        } else {
            for (Salle salle : salles) {
                System.out.println(salle.toString());
            }
        }
    }

    public static void AfficherReservations(ArrayList<Reservation> reservations) {
        if (reservations.isEmpty()) {
            System.out.println("Pas de réservations enregistrées");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation.toString());
            }
        }
    }
}
