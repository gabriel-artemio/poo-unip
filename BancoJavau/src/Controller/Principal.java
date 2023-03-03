package Controller;

import Model.Carteira;

public class Principal {
    public static void main(String[] args){
        Carteira op = new Carteira();
        
        op.Depositar(1000);
        System.out.println("Saldo Inicial - saldo: " + op.getSaldo());
        
        op.Sacar(50);
        System.out.println("Saquei - saldo: " + op.getSaldo());
        
        op.Transferir(500);
        System.out.println("Transferencia - saldo: " + op.getSaldo());
        
        op.Depositar(550);
        System.out.println("Depositei - saldo: " + op.getSaldo());
    }
}