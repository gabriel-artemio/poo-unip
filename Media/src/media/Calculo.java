package media;

public class Calculo {
    public float nota1;
    public float nota2;
    public float nota3;
    public float nota4;
    public float resultadoMedia;
    
    public float CalcularMedia(float nota1,float nota2,float nota3,float nota4){
        
        resultadoMedia = (nota1 + nota2 + nota3 + nota4) / 4;
        return resultadoMedia;
    }
}