package Clase1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        //numerosPares();

        //Ejercicio 2
        //multiplos();

        //Ejercicio 3
        /*System.out.print("Ingrese un valor: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (esPrimo(n)){
            System.out.print(n+" es número primo");
        }
        else {
            System.out.print(n+" no es número primo");
        }

        scanner.close();*/

        //Ejercicio 4
        //primerosPrimo();

        //Ejercicio 5
        cantidadNumeros();
    }

    public static void numerosPares(){
        System.out.print("Ingrese un valor: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i*2);
        }

        scanner.close();
    }

    /*public static void multiplosAux(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int m = scanner.nextInt();

        int aux = 1;

        for (int i = 0; i < n; i++) {
            while (m % aux != 0 && aux <= m) {
                aux++;
            }
            if (aux <= m){
                System.out.println(aux);
                aux++;
            }
        }

        scanner.close();
    }*/

    public static void multiplos(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(m*i);
        }

        scanner.close();
    }

    public static boolean esPrimo(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primerosPrimo(){
        System.out.print("Ingrese un valor: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int aux = 1;

        for (int i = 0; i < n; i++) {
            while (!esPrimo(aux)) {
                aux++;
            }
            System.out.println(aux);
            aux++;
        }

        scanner.close();
    }

    public static void cantidadNumeros(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primer valor: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese segundo valor: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese tercer valor: ");
        int d = scanner.nextInt();

        int aux = 0;
        int aux2;

        for (int i = 0; i < n; i++) {
            int veces = 0;

            while (veces < m){
                veces = 0;
                aux++;
                aux2 = aux;

                while (aux2 != 0) {
                    if (aux2 % 10 == d){
                        veces++;
                    }
                    aux2 = aux2 / 10;
                }
            }

            System.out.println(aux);
        }

        scanner.close();
    }
}
