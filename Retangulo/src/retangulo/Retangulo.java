package retangulo;

import java.util.Scanner;
import CalcularRetangulo.CalcularRetangulo;

public class Retangulo {
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
        CalcularRetangulo calcular = new CalcularRetangulo();
        
        System.out.println("Base do retangulo: ");
        int base = myObj.nextInt();
        System.out.println("Altura do retangulo: ");
        int altura = myObj.nextInt();
                
        int valor = calcular.Calculo(base, altura);
        System.out.println("Valor do retangulo: " + valor);
    }
}