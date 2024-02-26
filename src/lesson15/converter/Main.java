package lesson15.converter;

public class Main {
    public static void main(String[] args) {
        double temperature = 21.5;
        Converter convert[] = new Converter[3];
        convert[0] = new CelsiusConverter();
        convert[1] = new KelvinConverter();
        convert[2] = new FahrenheitConverter();
        for (Converter c : convert) {
            System.out.printf("t = %.1f%n", c.getConverterValue(temperature));
        }

    }
}

interface Converter{
    double getConverterValue(double baseValue);
}

class CelsiusConverter implements Converter{
    @Override
    public double getConverterValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter{
    @Override
    public double getConverterValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter{
    @Override
    public double getConverterValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
