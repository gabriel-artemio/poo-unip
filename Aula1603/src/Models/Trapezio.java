package Models;

public class Trapezio extends Figura {
    public Trapezio(long altura, long base){
        super(altura, base);
    }
    @Override
    public double area(){
        return super.area()/2;
    }
}