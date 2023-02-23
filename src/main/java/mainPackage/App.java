package mainPackage;

public class App {
    public static void main(String[] args) {
        Film [] films = new Film[5];
        films[0] = new Film("Terminator", 1,30,45,"James Cameron",
                false, 16);
        films[1] = new Film("Ring Lord", 2,20,0,"Peter Jackson",
                false, 12);
        films[2] = new Film("Titanic", 2,5,0,"James Cameron",
                false, 12);
        films[3] = new Film("Avatar-2", 2,45,0,"James Cameron",
                true, 5);
        films[4] = new Film("The Lion King", 1,30,0,"Roger Allers",
                false, 3);

        Film films1 = new Film("Terminator", 1,30,45,"James Cameron",
                false, 16);
        Film films2 = new Film("Ring Lord", 2,20,0,"Peter Jackson",
                false, 12);
        Film films3 = new Film("Titanic", 2,5,0,"James Cameron",
                false, 12);
        Film films4 = new Film("Avatar-2", 2,45,0,"James Cameron",
                true, 5);
        Film films5 = new Film("The Lion King", 1,30,0,"Roger Allers",
                false, 3);

        FilmGenericStorage filmGenericStorageApp = new FilmGenericStorage<>();
        Integer [] key;
        System.out.println(filmGenericStorageApp.create(films).toString());
        key = (Integer[]) filmGenericStorageApp.create(films);
        System.out.println(key[3]);
        System.out.println(filmGenericStorageApp.read(key[4]));
        System.out.println(filmGenericStorageApp.read(key[2]));

    }
}
