public class Fahrenheit extends Converter {

    Fahrenheit(double temp, char convert) {
        this.temp = temp;
        if (convert == 'F') {
            System.out.println("Темература равна =" + getTempToFar() + " по фаренгейту");
        } else {
            System.out.println("Неккоректый ввод");
        }
    }
}

