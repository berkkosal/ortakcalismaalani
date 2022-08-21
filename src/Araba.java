import java.util.Calendar;

public class Araba {


    private Teker onTeker;
    private Teker arkaTeker;
    private Motor motor;

    public Araba(Teker onTeker, Teker arkaTeker, Motor motor) {

        this.modelYili = Calendar.getInstance().get(Calendar.YEAR);
        this.onTeker = onTeker;
        this.arkaTeker = arkaTeker;
        this.motor = motor;

    }


    public int arabaYiliniGoster() {

        return this.modelYili;

    }

    private int modelYili;

    public Teker getOnTeker() {
        return onTeker;
    }

    public Teker getArkaTeker() {
        return arkaTeker;
    }

    public Motor getMotor() {
        return motor;
    }


}
