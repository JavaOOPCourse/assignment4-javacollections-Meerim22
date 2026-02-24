package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Math advising - 10:00");
        appointments.add("CS project consultation - 11:00");
        appointments.add("Scholarship office - 14:00");
        appointments.addFirst("URGENT: Graduation status review - 09:30");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            System.out.println("Cancelled: " + appointments.removeLast());
        }
    }

    public void showFirstAndLast() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        System.out.println("First appointment: " + appointments.getFirst());
        System.out.println("Last appointment: " + appointments.getLast());
    }

    public void printAppointments() {
        System.out.println("Appointments:");
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
