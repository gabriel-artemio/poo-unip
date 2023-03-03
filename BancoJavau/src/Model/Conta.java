package Model;

public class Conta {
    private String nome;
    private double saldo;
    
    public void Sacar(double valor){
        //
        this.saldo = this.saldo - valor;
    }
    
    public void Depositar(double valor){
        //
        this.saldo = this.saldo + valor;
    }
    
    public void Transferir(double valor){
        //
        this.saldo = this.saldo - valor;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}