package clasesabstractas;

public class Circulo extends FigurasGeometricas{
    double radio;
    
    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return Math.PI*radio;
    }
}
