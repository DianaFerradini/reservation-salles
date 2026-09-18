package com.ism.repositories;

import java.util.ArrayList;

public interface IRepo<T> {
    public boolean save(T object);
    public ArrayList<T> findAll();
}
