

public class Valor {
    int numero;
    public int metodoQueHaceAlgo( int valor){
       numero = valor;
       
       if(valor<3){
           return valor;
       }
       return metodoQueHaceAlgo(valor-1)*metodoQueHaceAlgo(valor-2);
    }
}
