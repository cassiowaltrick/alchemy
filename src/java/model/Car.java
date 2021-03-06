package model;

import com.google.gson.annotations.SerializedName;

public class Car {


    public final int id;

    @SerializedName("nome")
    public final String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || !(o == null || getClass() != o.getClass()) && this.id != ((Car) o).id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
