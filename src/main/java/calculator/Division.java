package calculator;

public class Division implements Operador{
    public float operar(float n1, float n2) throws Exception{
        if (n2==0){
            throw new Exception("No existe division entre 0");
        }
        return n1/n2;
    }
}
