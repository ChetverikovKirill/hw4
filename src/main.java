import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение");
        Convected con = Convectore.convecter(scanner.next()) ;
        System.out.println("Введите температуру");
        con.setTemp(scanner.nextDouble());
        System.out.println(con.getTemp());
    }
}