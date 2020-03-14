package main;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("1: Número al contrario.");
        System.out.println("2: Tabla de multiplicar.");
        System.out.println("3: Edad y altura promedio.");
        System.out.println("4: Número mayor de 3.");
        System.out.println("5: Indice de masa corporal.");
        System.out.println("6: Primeros números de un número.");
        System.out.println("");
        System.out.println("Elige una opción: ");
        Scanner teclado = new Scanner(System.in);

        int opcion = teclado.nextInt();

        switch(opcion)
        {
            case 1:
                punto1.main(null);
                break;
            case 2:
                punto2.main(null);
                break;
            case 3:
                punto3.main(null);
                break;
            case 4:
                punto4.main(null);
                break;
            case 5:
                punto5.main(null);
                break;
            case 6:
                punto6.main(null);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
