import java.util.Scanner;
public class Beecr1014{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    float y = input.nextFloat();
    
    float div = x/y;
    System.out.printf("%.3f km/l\n",div);
    input.close();
    }
}