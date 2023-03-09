package Controller;

import Model.Carteira;
import View.InterfaceBanco;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Carteira op = new Carteira();
        InterfaceBanco app = new InterfaceBanco();
        
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        String agencia = JOptionPane.showInputDialog("Informe a sua agência: ");
        String conta = JOptionPane.showInputDialog("Informe a sua conta: ");
        
        app.txtSaldoConta1.setText(nome);
        app.txtAgencia.setText(agencia);
        app.txtConta.setText(conta);
        
        app.setVisible(true);
        app.setTitle("Banco Javau");
        app.setResizable(false);
        app.setLocationRelativeTo(null);
        
        op.Depositar(1000);
        //System.out.println("Saldo Inicial - saldo: " + op.getSaldo());
        op.Sacar(50);
        //.out.println("Saquei - saldo: " + op.getSaldo());
        op.Transferir(500);
        //System.out.println("Transferencia - saldo: " + op.getSaldo());
        op.Depositar(550);
        //System.out.println("Depositei - saldo: " + op.getSaldo());
    }
}