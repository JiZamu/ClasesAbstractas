package clasesabstractas;

public abstract class FigurasGeometricas {
    private String nombre;
    
    public FigurasGeometricas(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double area();
    
    @Override
    public String toString(){
        return nombre+" area: "+area();
    }
}
