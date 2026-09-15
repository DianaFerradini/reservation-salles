package com.ism.domain;

public final class Salle extends AbstractEntity {
// Salle est final car aucune classe ne peu hériter de Salle

    private int num;
    private TypeSalle type;

    public Salle() {
    }

    public Salle(int id, int num, TypeSalle type) {
        super(id);
        this.num = num;
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TypeSalle getType() {
        return type;
    }

    public void setType(TypeSalle type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", num : " + num + ", type : " + type;
    }
}
