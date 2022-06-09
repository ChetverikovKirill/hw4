public class Converter {

    public double temp;

    protected double getTempToFar() {
        temp = temp * 1.8 + 32;
        return temp;

    }

    protected double getTempToСel() {
        temp = (temp - 32) / 1.8;
        return temp;
    }

}
