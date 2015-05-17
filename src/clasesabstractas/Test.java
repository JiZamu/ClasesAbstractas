package clasesabstractas;

public class Test {
    public static void main(String[] args){
        FigurasGeometricas[] figuras = {new Circulo(767.1), new Cuadrado(67.1)};
        for(int i = 0; i < figuras.length; i++){
            System.out.println(figuras[i]);
        }
    }
}
