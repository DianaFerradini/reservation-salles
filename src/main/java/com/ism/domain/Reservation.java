package com.ism.domain;

import java.util.Date;

public final class Reservation extends AbstractEntity {
// Reservation est final car aucune classe ne peu hériter de Reservation

    private String auNomDe;
    private Date date;
    private int heureDebut;
    private int heureFin;
    private Salle salle;
    private StatutReservation statut;

    public Reservation() {
    }
    
    public Reservation(int id, String auNomDe, Date date, int heureDebut, int heureFin, Salle salle,
            StatutReservation statut) {
        super(id);
        this.auNomDe = auNomDe;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salle = salle;
        this.statut = statut;
    }

    public String getAuNomDe() {
        return auNomDe;
    }

    public void setAuNomDe(String auNomDe) {
        this.auNomDe = auNomDe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public StatutReservation getStatut() {
        return statut;
    }

    public void setStatut(StatutReservation statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", au nom de : " + auNomDe + ", date : " + date + ", heure de début : " + heureDebut
                + ", heure de fin : " + heureFin + ", salle : " + salle.getNum() + ", statut : " + statut;
    }
}
