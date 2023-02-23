package mainPackage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString



public class Ticket {

    private int ticketNumber;
    private Session session;
    private double price;
    private Film film;
    private User user;

    public Ticket(Session session, double price, Film film, User user) {
        this.session = session;
        this.price = price;
        this.film = film;
        this.user = user;
    }
}
