package mainPackage;

public interface GenericStorage<K, V> {

    K[] create(V[] object);

    V read(K key);

    void delete(K key);

    void update(K key, V object);
}


