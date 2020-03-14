package main;
import java.util.Scanner;

public class punto3
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int edades = 0, edad = 0, estatura = 0, estaturas = 0, mayores18 = 0, mas175 = 0, can_es;

        System.out.println("Cantidad de estudiantes: ");
        can_es = teclado.nextInt();

        for(int i = 1; i <= can_es; i++)
        {
            System.out.println("Digite la edad del estudiante: ");
            edad = teclado.nextInt();
            edades += edad;

            if(edad > 18)
            {
                mayores18++;
            }

            System.out.println("Digite la estatura del estudiante en CM: ");
            estatura = teclado.nextInt();
            estaturas += estatura;

            if(estatura > 175)
            {
                mas175++;
            }
        }

        System.out.println("El promedio de edad es: " + "" + edades / can_es);
        System.out.println("Cantidad de estudiantes que son mayores de 18 años: " + mayores18);

        System.out.println("El promedio de estatura es: " + "" + estaturas / can_es);
        System.out.println("Cantidad de estudiantes que miden más de 175 son: " + mas175);
    }
}
