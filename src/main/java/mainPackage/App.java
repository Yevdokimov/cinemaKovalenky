package mainPackage;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Film[] films = new Film[5];
        films[0] = new Film("Terminator", 1, 30, 45, "James Cameron",
                false, 16);
        films[1] = new Film("Ring Lord", 2, 20, 0, "Peter Jackson",
                false, 12);
        films[2] = new Film("Titanic", 2, 5, 0, "James Cameron",
                false, 12);
        films[3] = new Film("Avatar-2", 2, 45, 0, "James Cameron",
                true, 5);
        films[4] = new Film("The Lion King", 1, 30, 0, "Roger Allers",
                false, 3);


        FilmGenericStorage filmGenericStorageApp = new FilmGenericStorage<>();

        List<Integer> keyFilms = new ArrayList<>();

        for (Film a : films) {
            keyFilms.add((Integer) filmGenericStorageApp.create(a));
            System.out.println(keyFilms);
        }
        System.out.println("~~~~~~~~~~~~~~~~~");
        for (Integer a : keyFilms) {
            System.out.println(filmGenericStorageApp.read(a).toString());
        }
        System.out.println("~~~~~~~~~~~~~~~~~");
        filmGenericStorageApp.delete(keyFilms.get(2));
        System.out.println("~~~~~~~~~~~~~~~~~");
        for (Integer a : keyFilms) {
            System.out.println(filmGenericStorageApp.read(a).toString());
        }
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println(filmGenericStorageApp.read(2).toString());
        System.out.println(filmGenericStorageApp.read(3).toString());
    }
}
