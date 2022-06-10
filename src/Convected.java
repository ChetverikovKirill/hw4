public class Convected {
    public double temp;
    public String value;

    Convected() {
    }

    public double getTemp() {
        System.out.println("Температура равна ");
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        System.out.println("Значение равно ");
        return value;
    }
}