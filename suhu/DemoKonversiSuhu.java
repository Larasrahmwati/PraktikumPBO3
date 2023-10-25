package Suhu;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        // Memanggil metode dari KonversiSuhu
        double fahrenheit = konversiSuhu.celciusToFahrenheit(25);
        double reamur = konversiSuhu.celciusToReamur(25);

        System.out.println("25 Celcius ke Fahrenheit: " + fahrenheit);
        System.out.println("25 Celcius ke Reamur: " + reamur);

        // Memanggil metode dari KonversiSuhu2
        double reamurFromFahrenheit = konversiSuhu2.fahrenheitToReamur(77); // 77 Fahrenheit = 25 Celcius
        System.out.println("77 Fahrenheit ke Reamur: " + reamurFromFahrenheit);
    }
} 