package clasesabstractas;

public class Cuadrado extends FigurasGeometricas{
    double longitud;
    
    public Cuadrado(double longitud){
        super("Cuadrado");
        this.longitud = longitud;
    }

    @Override
    public double area(){
        return Math.PI*longitud;
    } 
}
