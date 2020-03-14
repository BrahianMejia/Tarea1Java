package main;
import java.util.Scanner;

public class punto4
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Introduzca primer número: ");
        n1 = teclado.nextInt();

        System.out.print("Introduzca segundo número: ");
        n2 = teclado.nextInt();

        System.out.print("Introduzca tercer número: ");
        n3 = teclado.nextInt();

        if (n1 > n2)
        {
            if (n1 > n3)
            {
                System.out.println("El número mayor es: " + n1);
            }
            else {
                System.out.println("El número mayor es: " + n3);
            }
        }
        else if (n2 > n3)
        {
            System.out.println("El número mayor es: " + n2);
        }
        else {
            System.out.println("El número mayor es: " + n3);
        }
    }
}
