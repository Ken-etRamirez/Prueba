import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa la Expresion: ");
        Scanner sc= new Scanner(System.in);
        String expresion= sc.nextLine();
        String resultado=Conversor.conversorPFija(expresion);
        double resolucion= Solucion.resolucion(resultado);
        System.out.println("Notacion Polaca Inversa: ");
        System.out.println(resultado);
        System.out.println("Resultado: ");
        System.out.println(resolucion);
        sc.close();
    }
}
