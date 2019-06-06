package calculator;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void execute(){
        logger.log(Level.INFO, "Calculadora");
        logger.log(Level.INFO, "Ingresar una operación separada por un espacio");
        Scanner scan= new Scanner(System.in);
        float n1 = scan.nextFloat();
        char operador = scan.next().charAt(0);
        float n2 = scan.nextFloat();
        Calculadora calculadora = new Calculadora(n1, operador, n2);
        calculadora.printResult();
    }


    public static void main(String[] args){
        Main main = new Main();
        main.execute();
    }
}
