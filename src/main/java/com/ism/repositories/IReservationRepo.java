package com.ism.repositories;

import java.util.ArrayList;
import java.util.Date;

public interface IReservationRepo<T> extends IRepo<T> {
    public ArrayList<T> findByDate(Date date);
}
