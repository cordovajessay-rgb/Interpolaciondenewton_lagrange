public class InterpolacionLagrange 
{
    private static void validacionDatos(double[] x, double[] y){
        if(x==null || y == null || x.length == 0 || y.length == 0 ){
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos ni estar vacios.");
        }
        if(x.length != y.length){
            throw new IllegalArgumentException("Los areglos X y Y deben tner el mismo tamaño");
        }
        for(int i = 0; i < x.length; i++){
            for(int j = i + 1; j < x.length; i++){
                if(x[i] == x[j]){
                    throw new IllegalArgumentException("Nodos de X repetidos: " + x[i]);
                }
            }
        }
    }
    public static double interpolacionLagrange(double[] x, double[] y, double xEval){
        validacionDatos(x,y);
        double resultado = 0.0;
        int n = x.length;

        for (int i = 0; i < n; i++){
            double termino = y[i];
            for (int j = 0; j < n; j++){
                if(i != j ){
                    termino *= (xEval - x[j]) / (x[i] - x[j]);
                }
            }
            resultado += termino;
        }
        return  resultado;
    }
}