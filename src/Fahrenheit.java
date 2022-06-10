public class Fahrenheit extends Convected {

    double temp;
    String value;

    Fahrenheit() {
    }

    @Override
    public void setTemp(double temp) {
        this.temp = temp;
    }


    @Override
    public double getTemp() {
        System.out.println("Температура равна");
        temp = temp * 1.8 + 32;
        return temp;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        System.out.println("Значение равно");
        return value;
    }
}
