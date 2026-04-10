package app;

public class Main {

    static void main() {
        System.out.println("App converter temperature");

        double frt = 50;
        double resCls = fahrenheitToCelsius(frt);
        System.out.printf("%.2f degrees Fahrenheit equals %.2f degrees Celsius;\n", frt, resCls);
    }

    static double fahrenheitToCelsius(double frt){
        return (frt - 32) / 1.8;
    }
}
