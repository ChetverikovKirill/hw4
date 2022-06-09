public class Celsius extends Converter {

    Celsius(double temp, char convert) {
        this.temp = temp;
        if (convert == 'C') {
            System.out.println("Темература равна =" + getTempToСel() + " по цельсию");
        } else {
            System.out.println("Неккоректый ввод");
        }
    }
}
