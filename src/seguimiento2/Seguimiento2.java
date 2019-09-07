/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento2;

import java.util.Scanner;

/**
 *
 * @author s109e9
 */
public class Seguimiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*********** Estructuras Repetitivas For *****************");
        numeroDelUnoAlCien();
        numeroDelcienAlUno();
        numerosParesDe1Al150();
        sumaNumeros1Al200();
        numeroConvertidoEnAsteriscos();
        tablaParesImpares();

        System.out.println("*********** Estructuras Repetitivas while*****************");
        numeroDelUnoAlCienWhile();
        numeroDelcienAlUnoWhile();
        numerosParesDe1Al150While();
        sumaNumeros1Al200while();
        numeroConvertidoEnAsteriscosWhile();
        tablaParesImparesWhile();
    }

    /*
     Mostrar los números del 1 al 100 
     */
    public static void numeroDelUnoAlCien() {

        int[] numeros = new int[100];

//for numeros del uno al cien
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = i + 1;

        }

        //Impresión de datos
        System.out.println("\n" + "Números del 1 al 100 ");
        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);
        }
    }

    /*
     Mostrar los números del 1 al 100 
     */
    public static void numeroDelUnoAlCienWhile() {

        int i = 1;
//while numeros del uno al cien
        System.out.println("\n" + "Números del 1 al 100 ");
        while (i <= 100) {

            System.out.println(i);
            i++;
        }

    }

    /*
     Mostrar los números del 100 al 1
     */
    public static void numeroDelcienAlUno() {

        System.out.println("\n" + "Números del 100 al 1 ");

        //for numeros del cien al uno
        for (int i = 100; i >= 1; i--) {

            System.out.println(i);
        }

    }

    /*
     Mostrar los números del 100 al 1
     */
    public static void numeroDelcienAlUnoWhile() {

        System.out.println("\n" + "Números del 100 al 1 ");
        int i = 100;
        //while numeros del cien al uno
        while (i >= 1) {

            System.out.println(i);
            i--;
        }

    }


    /*
     Mostrar los números pares del 1 al 150
     */
    public static void numerosParesDe1Al150() {

        System.out.println("\n" + "Números pares del 1 al 150 ");

        for (int i = 1; i <= 150; i++) {
            //Validacion si es par 
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es par");
            }
        }

    }

    /*
     Mostrar los números pares del 1 al 150
     */
    public static void numerosParesDe1Al150While() {

        System.out.println("\n" + "Números pares del 1 al 150 ");
        int i = 1;
        while (i <= 150) {
            //Validacion si es par 
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es par");
            }
            i++;
        }

    }


    /*
     Mostrar la suma de los números que van del 1 al 200
     */
    public static void sumaNumeros1Al200() {

        double suma = 0;
        System.out.println("\n" + "Suma de los números que van del 1 al 200 ");

        for (int i = 1; i <= 200; i++) {
            //suma
            suma = i * (i + 1) / 2;

        }
        System.out.println("La suma es: " + suma);

    }

    /*
     Mostrar la suma de los números que van del 1 al 200
     */
    public static void sumaNumeros1Al200while() {

        double suma = 0;
        System.out.println("\n" + "Suma de los números que van del 1 al 200 ");
        int i = 1;
        while (i <= 200) {
            //suma
            suma = i * (i + 1) / 2;
            i++;
        }
        System.out.println("La suma es: " + suma);

    }

    /*
     Números en asteriscos
     */
    public static void numeroConvertidoEnAsteriscos() {

        Scanner scanner = new Scanner(System.in);

        //Ingresar numero
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Número ingresado: " + numero);

        //Impresión de numeros en asteriscos
        System.out.println("\n" + "Número convertidos en asteriscos ");
        for (int i = 0; i < numero; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }

    /*
     Números en asteriscos
     */
    public static void numeroConvertidoEnAsteriscosWhile() {

        Scanner scanner = new Scanner(System.in);
        int i = 0;;
        //Ingresar numero
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Número ingresado: " + numero);

        //Impresión de numeros en asteriscos
        System.out.println("\n" + "Número convertidos en asteriscos ");
        while (i < numero) {
            System.out.print("* ");
            i++;
        }

        System.out.println();
    }


    /*
     mostrar una tabla de 10*10 donde los numeros pares tienen una x y los impares una o
     */
    public static void tablaParesImpares() {
        int[][] miMatriz = new int[10][10];
        int cont = 0;
        System.out.println("Tabla de 10*10 con indices pares como x y impares como o");
        for (int fila = 0; fila < miMatriz.length; fila++) {
            for (int columna = 0; columna < miMatriz.length - 1; columna++) {
//Valida si es par o impar 
                if ((cont) % 2 == 0) {
                    System.out.print("x ");

                } else {
                    System.out.print("o ");
                }

                cont = cont + 1;
            }
            System.out.println();
        }
    }

    /*
     mostrar una tabla de 10*10 donde los numeros pares tienen una x y los impares una o
     */
    private static void tablaParesImparesWhile() {
        int[][] miMatriz = new int[10][10];
        int cont = 0;
        int fila = 0;
        int columna = 0;
        System.out.println("Tabla de 10*10 con indices pares como x y impares como o");
        while (fila < miMatriz.length) {
            columna = 0;
            while (columna < miMatriz.length - 1) {
//Valida si es par o impar 
                if ((cont) % 2 == 0) {
                    System.out.print("x ");

                } else {
                    System.out.print("o ");
                }

                cont = cont + 1;
                columna++;
            }
            System.out.println();
            fila++;
        }
    }

}
