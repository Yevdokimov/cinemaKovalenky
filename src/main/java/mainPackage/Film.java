package mainPackage;


import java.awt.*;
import java.sql.Time;
import java.util.Arrays;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Film {
    protected String filmName;
    private Image iconFilms;
    private Time time;
    private String directorName;
    public Session [] session;
    boolean premiere;
    private int minAge;

    public Film(String filmName, int hour, int minute, int second, String directorName, boolean premiere, int minAge) {
        this.filmName = filmName;
        this.time = new Time(hour, minute, second);
        this.directorName = directorName;
        this.premiere = premiere;
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", iconFilms=" + iconFilms +
                ", time=" + time +
                ", directorName='" + directorName + '\'' +
                ", session=" + Arrays.toString(session) +
                ", premiere=" + premiere +
                ", minAge=" + minAge +
                '}';
    }
}
