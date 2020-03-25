package xyz.kandrac;

import java.util.Date;

/**
 * Zadanie 1
 */
public class Weather {

    private double wind;
    private char windDirection;
    private double temperature;
    private double zrazky;
    private double oblacnost;
    private Date datum;
    private int hodina;

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public char getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(char windDirection) {
        this.windDirection = windDirection;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getZrazky() {
        return zrazky;
    }

    public void setZrazky(double zrazky) {
        this.zrazky = zrazky;
    }

    public double getOblacnost() {
        return oblacnost;
    }

    public void setOblacnost(double oblacnost) {
        this.oblacnost = oblacnost;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getHodina() {
        return hodina;
    }

    public void setHodina(int hodina) {
        this.hodina = hodina;
    }
}
