import java.util.Random;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        boolean continuar = true;

        while (continuar){

            int num1 = random.nextInt(100)+1;
            int num2 = random.nextInt(100)+1;

            System.out.println("Ingrese un signo (+,-,*,/,^,%");
            String signo = scanner.next();

            double resultado = 0;
            switch (signo){
                case "+":
                    resultado = sumar(num1, num2);
                    break;
                case "-":
                    resultado = restar(num1, num2);
                    break;
                case "*":
                    resultado = multiplicar(num1, num2);
                    break;
                case "/":
                    resultado = dividir(num1,num2);
                    break;
                case "^":
                    resultado = exponenciar(num1,num2);
                    break;
                case "%":
                    resultado = modulo(num1,num2);
                    break;
                default:
                    System.out.println("Operador no valido.");
                    continue;


            }
            System.out.println("El resultado de " + num1 + "" + signo + "" + num2 + "es:" + resultado);
            System.out.println("¿Quieres realizar otra opercaion? (S/N): ");
            continuar = scanner.next().equalsIgnoreCase("S");


        }
        scanner.close();



    }
    public static int sumar (int a,int b){
        return a+b;
    }
    public static int restar ( int a, int b){
        return a-b;
    }
    public static int multiplicar (int a, int b){
        return a*b;
    }
    public static int dividir (int a, int b){
        return a/b;
    }
    public static int exponenciar (int a, int b ){
        return a^b;
    }
    public static int modulo (int a, int b){
        return a%b;


    }

}