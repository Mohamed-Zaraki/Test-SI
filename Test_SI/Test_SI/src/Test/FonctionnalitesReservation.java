package Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FonctionnalitesReservation {

	private List<Reservation> reservations = new ArrayList<>();

	public FonctionnalitesReservation() {
		reservations = new ArrayList<>();

	}

	public void addReservation(Reservation reservation , Batiment batiment) throws SalleNotExist {
		
				if(batiment.salles.contains(reservation.getSalle()))
				{

				
				throw new SalleNotExist("Salle non-Trouvée.");
			}
			
		
		reservations.add(reservation);
	}

	public void ModifierReservation(String IdResrvation,
			String Nom_Employe,
			LocalDateTime Date,
			double Durée,
			Salle salle) throws ReservationNonTrouvéeException {
		for (Reservation reservation : reservations) {
			if (reservation.getIdResrvation().equals(IdResrvation)) {
				reservation.setIdResrvation(IdResrvation);
				reservation.setNom_Employe(Nom_Employe);
				reservation.setDate(Date);
				reservation.setDurée(Durée);
				reservation.setSalle(salle);
				return;
			}
		}
		throw new ReservationNonTrouvéeException("Reservation non-trouvée");

	}

	public void removeReservation(String id) throws ReservationNonTrouvéeException {
		for (Reservation reservation : reservations) {
			if (reservation.getIdResrvation().equals(id)) {
				reservations.remove(reservation);
				return;
			}
		}

		throw new ReservationNonTrouvéeException("Reservation non-trouvée");

	}

	public List<Reservation> afficherReservations() {
		return new ArrayList<>(reservations);
	}
}
