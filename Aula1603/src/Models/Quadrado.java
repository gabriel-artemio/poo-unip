package Models;

public class Quadrado extends Figura {
    public Quadrado(long altura, long base){
        super(altura, base);
    }
    @Override
    public double area(){
        return super.area()/2;
    }
}