import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ort;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = scanner.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce = scanner.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = scanner.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = scanner.nextInt();

        ort = (mat+fizik+turkce+ kimya+ muzik) /5;

        if (ort <55){
            System.out.println("naneyi yediniz");
        }else {
            System.out.println("tebrikler");
        };
    }
}