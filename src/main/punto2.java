package main;
import java.util.Scanner;

public class punto2
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner( System.in );
        System.out.println( "Punto 2 de generar tabla de multipicar" );
        System.out.println( "Introduce un número: " );

        int numero = teclado.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println("La multiplicación de " + numero + " x " + i + " es: " + (numero * i));
        }
    }
}
