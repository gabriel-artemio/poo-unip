package operacoes;

public class OperacoesCalculadora {
    public int valor1;
    public int valor2;
    public int resultado;
    
    public int Somar(int valor1,int valor2){
        resultado = valor1 + valor2;
        return resultado;
    }
    
    public int Subtrair(int valor1,int valor2){
        resultado = valor1 - valor2;
        return resultado;
    }
    
    public int Dividir(int valor1,int valor2){
        resultado = valor1 / valor2;
        return resultado;
    }
    
    public int Multiplicar(int valor1,int valor2){
        resultado = valor1 * valor2;
        return resultado;
    }
}