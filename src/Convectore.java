public class Convectore {
    public String value;

    public static Convected convecter(String value) {
        if (value.equals("F")) {
            return new Fahrenheit();
        } else if (value.equals("C")) {
            return new Celsius();
        } else {
            System.out.println("Еще раз");
        }
        return null;
    }
}
