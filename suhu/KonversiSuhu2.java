package Suhu;

public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur(double fahrenheit) {
        // Menggunakan metode celciusToReamur dari parent class
        double celcius = (fahrenheit - 32) * 5 / 9;
        return celciusToReamur(celcius);
    }
}