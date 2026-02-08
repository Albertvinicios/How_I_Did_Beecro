import java.util.Scanner;
public class Beecr1173{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vet1[] = new int[10];
        int valor = input.nextInt();
        for(int n = 0; n < 10 ; n++)
        {
            if (valor >= 50)
            {
                System.out.println("esse número é inválido, digite novamente");
                n = 0;
            }
            if (n == 0)
            {
                vet1[n] = valor;
            }
            else
            {
                vet1[n] = (vet1[n-1]*2);
            } 

        }
        for(int n = 0; n < 10; n++)
        { 
            
            System.out.println("N["+n+"] = "+ vet1[n]);
        }
    input.close();
    }
}