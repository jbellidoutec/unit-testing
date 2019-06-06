package calculator;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Calculadora {
    String[] tokens;
    private float resultado;
    private boolean error=false;
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void printResult(){
        if (error) logger.log(Level.WARNING, "No se puede obtener el resultado");
        else logger.log(Level.INFO, "Resultado: " + resultado);
    }

    public Calculadora(float n1, char operador, float n2){
        switch(operador) {
            case '+':
                Suma suma = new Suma();
                resultado = suma.operar(n1, n2);
                break;
            case '-':
                Resta resta = new Resta();
                resultado = resta.operar(n1,n2);
                break;
            case '*':
                Multiplicacion mult = new Multiplicacion();
                resultado = mult.operar(n1,n2);
                break;
            case '/':
                Division div = new Division();
                try{
                    resultado = div.operar(n1, n2);
                }
                catch(Exception e){
                    logger.log(Level.SEVERE , "No existe division por 0");
                }
                break;
            default:
                logger.log(Level.SEVERE ,"Operador no identificado");
                error = true;
        }
    }
}
