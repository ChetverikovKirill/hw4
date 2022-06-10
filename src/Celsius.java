public class Celsius extends Convected {

    double temp;
    String value;
    Celsius(double temp, String value) {
        this.temp =temp;
        this.value= "F";
    }
    Celsius(){
    }
    @Override
    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public double getTemp() {
        System.out.println("Температура равна ");
        temp = (temp - 32) / 1.8;
        return temp;
    }

    @Override
    public String getValue() {
        System.out.println("Значение равно");
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
