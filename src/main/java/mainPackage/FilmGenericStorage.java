package mainPackage;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FilmGenericStorage<K, V> implements GenericStorage<K, V> {

    K key;
    V value;
    InnerStorage innerStorage = new InnerStorage();
    FilmGenericStorage filmGenericStorage;

    FilmGenericStorage(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
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
    public K create(V object) {
        K key = (K) innerStorage.getLength();
        this.filmGenericStorage = new FilmGenericStorage(key, object);
        innerStorage.setFilmGenericStorageList(filmGenericStorage);
        return key;
    }

    @Override
    public V read(K key) {
        for (ListIterator<FilmGenericStorage<K, V>> filmGenericStorageListIterator =
             innerStorage.filmGenericStorageList.listIterator(); filmGenericStorageListIterator.hasNext(); ) {
            FilmGenericStorage<K, V> bufferGS = filmGenericStorageListIterator.next();
            if (bufferGS.key == key) {
                value = (V) bufferGS.value;
            }
        }
        return value;
    }


    @Override
    //delete no re
    public void delete(K key) {
        for (ListIterator<FilmGenericStorage<K, V>> filmGenericStorageListIterator =
             innerStorage.filmGenericStorageList.listIterator(); filmGenericStorageListIterator.hasNext(); ) {
            FilmGenericStorage<K, V> bufferGS = filmGenericStorageListIterator.next();
            if (bufferGS.key == key) {
                System.out.println(bufferGS.value);
                filmGenericStorageListIterator.remove();
            }

        }
    }

    @Override
    public void update(K key, V object) {

    }

    class InnerStorage {
        public InnerStorage() {
        }

        public List<FilmGenericStorage<K, V>> filmGenericStorageList = new ArrayList<>();


        public List<FilmGenericStorage<K, V>> getFilmGenericStorageList() {
            return filmGenericStorageList;
        }

        public void setFilmGenericStorageList(FilmGenericStorage filmGenericStorage) {
            this.filmGenericStorageList.add(filmGenericStorage);
        }

        public Integer getLength() {
            int length;
            length = filmGenericStorageList.size();
            return length + 1;
        }
    }
}
