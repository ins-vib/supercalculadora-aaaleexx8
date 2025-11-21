package org.yourcompany.calculadora;
import java.util.Random;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        mostrarMenu();
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    /**
     * Tira una moneda n vegades i retorna la quantitat de cares obtingudes.
     */
    public static int numCares(int n) {
        Random rng = new Random();
        int cares = 0;
        for (int i = 0; i < n; i++) {
            int coin = rng.nextInt(2); // 0 o 1
            if (coin == 0) {
                cares++;
            }
        }
        return cares;
    }

    /**
     * Calcula el preu final de l'entrada de cinema segons carnet jove i dia.
     */
    public static double preuCine(double preu, boolean jove, boolean dia) {
        if (jove) {
            preu -= preu * 0.15;
        }
        if (dia) {
            preu += preu * 0.10;
        }
        System.out.println("Preu final de l'entrada: " + preu + " €");
        return preu;
    }

    /**
     * Suma dels primers n números enters.
     */
    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
            if (i <= n - 1) {
                System.out.print(i + "+");
            } else {
                System.out.println(i);
            }
        }
        return suma;
    }

    /**
     * Calcula el factorial d'un número.
     */
    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
            if (i > 1) {
                System.out.print(i + "x");
            } else {
                System.out.println(i);
            }
        }
        return factorial;
    }

    /**
     * Suma dels quadrats dels primers n números.
     */
    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += (i * i);
            if (i <= n - 1) {
                System.out.print(i + "²+");
            } else {
                System.out.println(i + "²");
            }
        }
        return suma;
    }

    /**
     * Calcula la potència d'una base per un exponent enter.
     */
    public static int calcularPotencia(int base, int exponent) {
        int potencia = 0;
        if (exponent != 0) {
            potencia = base;
            for (int i = 1; i < exponent; i++) {
                int acumulador = 0;
                for (int j = 0; j < base; j++) {
                    acumulador += potencia;
                }
                potencia = acumulador;
            }
        }
        return potencia;
    }

    /**
     * Mostra el menú per triar les opcions i executa la corresponent funcionalitat.
     */
    public static void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("0. Sortir");
        System.out.println("1. Nombre de dígits");
        System.out.println("2. Suma nombres fins a n");
        System.out.println("3. Calcular factorial");
        System.out.println("4. Suma de quadrats");
        System.out.println("5. Calcular potència");
        System.out.println("6. Llançament monedes");
        System.out.println("7. Preu entrada Cinema");
        System.out.println("Entra opció:");
        
        int opcio = scan.nextInt();
        while (opcio != 0) {
            switch (opcio) {
                case 1:
                    System.out.println("Entra un nombre enter:");
                    int n = scan.nextInt();
                    int result = nombreDigits(n);
                    System.out.println("El nombre conté " + result + " dígits.");
                    break;
                case 2:
                    System.out.println("Entra un nombre enter:");
                    n = scan.nextInt();
                    result = sumaPrimersNumeros(n);
                    System.out.println("La suma dels primers " + n + " números és " + result);
                    break;
                case 3:
                    System.out.println("Entra el nombre per calcular factorial:");
                    n = scan.nextInt();
                    result = calcularFactorial(n);
                    System.out.println("El resultat del factorial és " + result);
                    break;
                case 4:
                    System.out.println("Entra un nombre enter:");
                    n = scan.nextInt();
                    result = sumaQuadrats(n);
                    System.out.println("La suma dels quadrats dels primers " + n + " números és " + result);
                    break;
                case 5:
                    System.out.println("Entra la base:");
                    int base = scan.nextInt();
                    System.out.println("Entra l'exponent:");
                    int exponent = scan.nextInt();
                    result = calcularPotencia(base, exponent);
                    System.out.println("El resultat de l'operació és " + result);
                    break;
                case 6:
                    System.out.println("Entra el nombre de llançaments de moneda:");
                    n = scan.nextInt();
                    result = numCares(n);
                    System.out.println("El nombre de cares és " + result);
                    break;
                case 7:
                    System.out.println("Entra el preu de l'entrada:");
                    double preu = scan.nextDouble();
                    System.out.println("Tens carnet jove? (true/false):");
                    boolean jove = scan.nextBoolean();
                    System.out.println("És dia especial? (true/false):");
                    boolean dia = scan.nextBoolean();
                    double preuFinal = preuCine(preu, jove, dia);
                    System.out.println("El preu final és de " + preuFinal + " €");
                    break;
                default:
                    System.out.println("Opció incorrecta.");
            }
            System.out.println("\nEntra una opció (0 per sortir):");
            opcio = scan.nextInt();
        }
        System.out.println("Sortint del programa. Fins aviat!");
        scan.close();
    }
}
