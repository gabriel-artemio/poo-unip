package Models;

public class Figura {
    public long altura;
    public long base;
    
    public Figura(long altura, long base){
        this.altura = altura;
        this.base = base;
    }
    
    public double area(){
        return 0;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public long getBase() {
        return base;
    }

    public void setBase(long base) {
        this.base = base;
    }
}