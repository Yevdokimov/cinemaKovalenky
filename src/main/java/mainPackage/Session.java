package mainPackage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@ToString

public class Session {
    private Film film;
    private Hall hall;
    private Date date;
    private Time time;

    public Session(Film film, Hall hall, Date date, Time time) {
        this.film = film;
        this.hall = hall;
        this.date = date;
        this.time = time;
    }
}

