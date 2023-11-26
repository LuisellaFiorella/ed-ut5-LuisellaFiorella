import java.util.Scanner;
public class EjemploParaEDE {
    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);
        double a, b, c, solucion1, solucion2, raiz;
        System.out.print (" Introduce el valor de a: ");
        a=sc.nextDouble();
        System.out.print (" Introduce el valor de b: ");
        b=sc.nextDouble();
        System.out.print (" Introduce el valor de c: ");
        c=sc.nextDouble();


        raiz = Math.pow (b, 2) - 4 *a *c;

        if (raiz < 0) {
            System.out.println("No existen soluciones reales");
        } else if (a==0) {
            System.out.println("El denominador no puede ser 0");
        } else { // Esto sirve para aclarar que esta es la tercera opción a escoger si no ocurren las dos previas;
            // si no lo pongo se produce un error en la lectura final.
            solucion1 = (-b + Math.sqrt (Math.pow(b,2) - 4 *a *c)) / (2 * a);
            solucion2 = (-b - Math.sqrt (Math.pow(b,2) - 4 *a *c)) / (2 * a);

            { System.out.println( "Solucion 1: " + solucion1);
                System.out.println( "Solucion 2: " + solucion2 );

            }

        }
    }
}

