package com.future.rocket.gof23.transfer.object;

import java.io.Serializable;

public class StudentVO implements Serializable {
    private static final long serialVersionUID = -8126714103873652130L;
    private int id;
    private String name;

    public StudentVO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
