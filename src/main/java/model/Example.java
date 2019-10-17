package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Example {


    @SerializedName("coord")
    @Expose
    public Coord coord;
    @SerializedName("main")
    @Expose
    public Main main;
    @SerializedName("timezone")
    @Expose
    public long timezone;
    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("cod")
    @Expose
    public long cod;

    public Example withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    public Example withMain(Main main) {
        this.main = main;
        return this;
    }

    public Example withTimezone(long timezone) {
        this.timezone = timezone;
        return this;
    }

    public Example withId(long id) {
        this.id = id;
        return this;
    }

    public Example withName(String name) {
        this.name = name;
        return this;
    }

    public Example withCod(long cod) {
        this.cod = cod;
        return this;
    }


}
