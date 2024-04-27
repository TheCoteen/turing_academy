package az.edu.turing.module01.part2.lesson11project.dao;

import java.util.Collection;

public interface DAO<T> {
    T save (T t);

    Collection<T> getAll();


}
