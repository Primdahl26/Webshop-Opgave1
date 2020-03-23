package Primdahl.Webshop.repository;

import java.util.ArrayList;

public interface ICrudRepository<T> {
    void create(T t);
    ArrayList<T> readAll();
    T read(long id);
    boolean update(T t);
    boolean delete(long id);
}
