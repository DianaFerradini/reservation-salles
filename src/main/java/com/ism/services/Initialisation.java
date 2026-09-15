package com.ism.services;

import java.util.Date;

import com.ism.domain.Reservation;
import com.ism.domain.Salle;
import com.ism.domain.StatutReservation;
import com.ism.domain.TypeSalle;

public final class Initialisation {
    private Initialisation() {
    }

    public static void initSalles() {
        for (int i = 0; i < 5; i++) {
            int id = i + 1; //pas toucher dans le switch
            int num = 0;
            TypeSalle type = TypeSalle.COURS;
            switch (i) {
                case 0:
                    num = 202;
                    break;

                case 1:
                    num = 303;
                    type = TypeSalle.EVENEMENTS_ETUDIANTS;
                    break;

                case 2:
                    num = 404;
                    type = TypeSalle.REUNIONS;
                    break;

                case 3:
                    num = 505;
                    type = TypeSalle.SOUTENANCES;
                    break;

                case 4:
                    num = 606;
                    type = TypeSalle.TRAVAUX_PRATIQUES;
                    break;
            
                default:
                    break;
            }
            Salle salle = new Salle(id, num, type);
            SalleService.add(salle);
        }
    }

    public static void initReservations() {
        for (int i = 0; i < 5; i++) {
            int id = i + 1; //pas toucher dans le switch
            String nom = "";
            Date date = null;
            int heureDebut = 0;
            int heureFin = 0;
            Salle salle = SalleService.getAll().get(i); //pas toucher dans le switch
            StatutReservation statut = StatutReservation.EN_ATTENTE; //pas toucher dans le switch
            switch (i) {
                case 0:
                    nom = "Awa Bah";
                    date = new Date(16/9/2026);
                    heureDebut = 8;
                    heureFin = 10;
                    break;

                case 1:
                    nom = "Dieyna Sow";
                    date = new Date(17/9/2026);
                    heureDebut = 10;
                    heureFin = 12;
                    break;

                case 2:
                    nom = "Sory Dembele";
                    date = new Date(18/9/2026);
                    heureDebut = 13;
                    heureFin = 15;
                    break;

                case 3:
                    nom = "Amy Ndiaye";
                    date = new Date(21/9/2026);
                    heureDebut = 15;
                    heureFin = 17;
                    break;

                case 4:
                    nom = "Aly Dieng";
                    date = new Date(22/9/2026);
                    heureDebut = 17;
                    heureFin = 19;
                    break;
            
                default:
                    break;
            }
            Reservation reservation = new Reservation(id, nom, date, heureDebut, heureFin, salle, statut);
            ReservationService.add(reservation);
        }
    }
}
