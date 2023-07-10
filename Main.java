// code for online reservationn system for oasis -udit 


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Reservation {
    private String reservationId;
    private Date startDate;
    private Date endDate;
    private String customerId;

    public Reservation(String reservationId, Date startDate, Date endDate, String customerId) {
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getCustomerId() {
        return customerId;
    }
}

class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(String reservationId, Date startDate, Date endDate, String customerId) {
        Reservation reservation = new Reservation(reservationId, startDate, endDate, customerId);
        reservations.add(reservation);
        System.out.println("Reservation added successfully.");
    }

    public void cancelReservation(String reservationId) {
        Reservation reservationToRemove = null;
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId().equals(reservationId)) {
                reservationToRemove = reservation;
                break;
            }
        }
        if (reservationToRemove != null) {
            reservations.remove(reservationToRemove);
            System.out.println("Reservation cancelled successfully.");
        } else {
            System.out.println("Reservation not found.");
        }
    }

    public void displayReservations() {
        System.out.println("Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println("Reservation ID: " + reservation.getReservationId());
            System.out.println("Start Date: " + reservation.getStartDate());
            System.out.println("End Date: " + reservation.getEndDate());
            System.out.println("Customer ID: " + reservation.getCustomerId());
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        reservationSystem.addReservation("R001", new Date(), new Date(), "C001");
        reservationSystem.addReservation("R002", new Date(), new Date(), "C002");
        reservationSystem.displayReservations();
        reservationSystem.cancelReservation("R001");
        reservationSystem.displayReservations();
    }
}
