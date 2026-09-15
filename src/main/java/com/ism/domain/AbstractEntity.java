package com.ism.domain;

public class AbstractEntity {
    protected int id;

    protected AbstractEntity() {
    }

    protected AbstractEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
