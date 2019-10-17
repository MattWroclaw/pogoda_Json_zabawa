package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    @Expose
    public double temp;
    @SerializedName("pressure")
    @Expose
    public long pressure;
    @SerializedName("humidity")
    @Expose
    public long humidity;
    @SerializedName("temp_min")
    @Expose
    public double tempMin;
    @SerializedName("temp_max")
    @Expose
    public double tempMax;

    public Main withTemp(double temp) {
        this.temp = temp;
        return this;
    }

    public Main withPressure(long pressure) {
        this.pressure = pressure;
        return this;
    }

    public Main withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    public Main withTempMin(double tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    public Main withTempMax(double tempMax) {
        this.tempMax = tempMax;
        return this;
    }

}

