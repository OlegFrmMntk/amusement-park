package Controller;

import Model.Ticket;

import java.util.Calendar;
import java.util.Date;

public class PurchaseManagement {

    public Ticket toBuyTicket(double price) {

        return new Ticket(1, new Date(2020, Calendar.DECEMBER, 2), 12,
                new Date(2020, Calendar.DECEMBER, 4));
    }

    public Ticket toBuySubscription(double price) {

        return new Ticket(1, new Date(2020, Calendar.DECEMBER, 2), 12,
                new Date(2020, Calendar.DECEMBER, 4));
    }

}
