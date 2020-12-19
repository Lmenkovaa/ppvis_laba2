package model;

import java.util.Date;

public class Ticket {
    private Trip trip;
    private Transport transport;

    public Ticket() {
        trip = new Trip();
        transport = new Transport();
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public Trip getTrip() {
        return trip;
    }
}
