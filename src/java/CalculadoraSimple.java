package java;
import java.util.Scanner;
public class CalculadoraSimple {
public static double dividir(double a, double b) {
return a / b;
}
public static double multiplicar(double a, double b) {
return a * b;
}
public static double sumar(double a, double b) {
return a + b;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Calculadora Simple:");
System.out.print("Introduce el primer número: ");
double numero1 = scanner.nextDouble();      
System.out.print("Introduce el segundo número: ");
double numero2 = scanner.nextDouble();
double resultadoDividir = dividir(numero1, numero2);
double resultadoSumar = sumar(numero1, numero2);
double resultadoMultiplicar = multiplicar(numero1, numero2);
System.out.println("Resultado de la suma: " + resultadoSumar);
System.out.println("Resultado de la division: " + resultadoDividir);
System.out.println("Resultado de la multiplicación: " + resultadoMultiplicar);
scanner.close();
}
}
