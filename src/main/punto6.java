package main;
import java.util.Scanner;

public class punto6
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int numero,i;
        i=1;

        System.out.println("ingrese un número: ");
        numero = teclado.nextInt();

        System.out.println("los números son: ");
        while (i < numero)
        {
            System.out.println(i);
            i++;
        }
    }
}
