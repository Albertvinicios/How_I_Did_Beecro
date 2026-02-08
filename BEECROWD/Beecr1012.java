import java.io.IOException;
import java.util.Scanner;

public class Beecr1012 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);    
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double areatr = (a*c)/2;
        double areac = (c*c)*3.14159;
        double areat = ((a+b)*c)/2;
        double areaq = (b*b);
        double arear = a*b;
        
        System.out.printf("TRIANGULO: %.3f\n", areatr);
        System.out.printf("CIRCULO: %.3f\n", areac);
        System.out.printf("TRAPEZIO: %.3f\n", areat);
        System.out.printf("QUADRADO: %.3f\n", areaq);
        System.out.printf("RETANGULO: %.3f\n", arear);
        
        input.close();
    }
}