package model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Coord {

    @SerializedName("lon")
    @Expose
    public double lon;
    @SerializedName("lat")
    @Expose
    public double lat;

    public Coord withLon(double lon) {
        this.lon = lon;
        return this;
    }

    public Coord withLat(double lat) {
        this.lat = lat;
        return this;
    }
}
