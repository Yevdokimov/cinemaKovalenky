package mainPackage;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FilmGenericStorage<K, V> implements GenericStorage<K, V> {


    K key;
    V value;
    InnerStorage innerStorage = new InnerStorage();
    FilmGenericStorage filmGenericStorage;

    FilmGenericStorage(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public FilmGenericStorage() {

    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public K[] create(V[] object) {
        int ID;
        final AtomicInteger count = new AtomicInteger(0);
        Integer [] key = new Integer[object.length];
        for (V g : object) {
            ID = count.incrementAndGet();
            key[ID-1] = ID;
            filmGenericStorage = new FilmGenericStorage(key, g);
            innerStorage.setFilmGenericStorageList(filmGenericStorage);
        }
        return (K[]) key;
    }

    @Override
    public V read(K key) {
        filmGenericStorage = innerStorage.getFilmGenericStorageList().get((Integer) key);
        value = (V) filmGenericStorage.getValue();
        return value;
    }

    @Override
    public void delete(K key) {

    }

    @Override
    public void update(K key, V object) {

    }

    class InnerStorage{
        public InnerStorage() {
        }

        public List<FilmGenericStorage<K,V>> filmGenericStorageList = new ArrayList<>();


        public List<FilmGenericStorage<K, V>> getFilmGenericStorageList() {
            return filmGenericStorageList;
        }

        public void setFilmGenericStorageList(FilmGenericStorage filmGenericStorageList) {
            this.filmGenericStorageList.add(filmGenericStorageList);
        }
    }
}
