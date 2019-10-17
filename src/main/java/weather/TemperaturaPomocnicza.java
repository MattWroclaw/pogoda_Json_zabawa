package weather;

public class TemperaturaPomocnicza {
    private double tempAux= 0.0;

    public double getTempAux() {
        return tempAux;
    }

    public void setTempAux(double tempAux) {
        this.tempAux = tempAux;
    }

    public TemperaturaPomocnicza(double tempera){
        tempAux = tempera;
    }
}
