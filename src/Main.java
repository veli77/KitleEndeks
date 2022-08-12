import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Boyunuz,Kilo,Kitle;
        Scanner input = new Scanner(System.in);

        System.out.print("Metre Cinsinden Boyunuz: ");
        Boyunuz = input.nextDouble();
        System.out.print("Kilonuz: ");
        Kilo = input.nextDouble();
        Kitle=Kilo/(Boyunuz*Boyunuz);
        System.out.println("Kitle Endeksi:"+ Kitle);
    }
}
