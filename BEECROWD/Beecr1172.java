import java.util.Scanner;
public class Beecr1172 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vet1[] = new int[10];
            for (int n = 0;n < 10; n++)
            {
                int valor = input.nextInt();
                    if (valor <= 0)
                    {
                        valor = 1;
                    }
                    vet1[n]+=valor;
            }
            for (int n = 0; n < 10; n++)
            {
                System.out.println("X["+n+"] = "+vet1[n]);
            }
    input.close();
    }
}