import java.util.Scanner; 
public class Marzo24exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(" Ingresar el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println(" Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();
        if (numero1 != numero2) { 
            System.out.println(numero1 + " != " + numero2);
        }
        if (numero1 < numero2) { 
            System.out.println(numero1 + " < " + numero2);
        }
        if (numero1 <= numero2) { 
            System.out.println(numero1 + " <= " + numero2);
        }
    }
}