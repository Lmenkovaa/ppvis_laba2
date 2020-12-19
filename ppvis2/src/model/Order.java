package model;

public class Order {
    Ticket ticket;
    Customer customer;

    public Order() {
        ticket = new Ticket();
        customer = new Customer();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
