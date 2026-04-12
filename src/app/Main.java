package app;

public class Main {
    static final double OFFSET = 32;
    static final double SCALING_FACTOR = 1.8;

    static void main() {
        System.out.println("App converter temperature");

        double frt = 50;
        double cls = 20;
        double resCls = fahrenheitToCelsius(frt);
        double resFrt = celsiusToFahrenheit(cls);
        System.out.printf("%.2f degrees Fahrenheit equals %.2f degrees Celsius;\n", frt, resCls);
        System.out.printf("%.2f degrees Celsius equals %.2f degrees Fahrenheit;\n", cls, resFrt);
    }

    static double fahrenheitToCelsius(double frt){
        return (frt - OFFSET) / SCALING_FACTOR;
    }

    static double celsiusToFahrenheit(double cls){
        return cls * SCALING_FACTOR + OFFSET;
    }
}
