package tn.esprim.gestionfoyer.service;

import tn.esprim.gestionfoyer.entities.Foyer;
import tn.esprim.gestionfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
