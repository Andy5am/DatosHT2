/**
 * Clase MyCalculator
 * Se encarga de efectuar las operaciónes disponnibles del probrama y los devuelve.
 *
 * @author Andy Catillo y Abril Palencia
 * @version 31/01/2019
 */


public class MyCalculator implements Calculator {
    /**
     * Método calculate
     * recibe los numeros y efectua la operacion respectiva para cada operando.
     * @param num1 primer numero en la pila.
     * @param num2 segundo numero en la pila.
     * @param op operador recibido.
     * @return devuelve el resultado de la operación.
     */
    public int calculate(int num1, int num2, String op){
    //devuelve el resultado de la operacion que el susuario desea.
        if(op.equals("+")){
            return num1 + num2;
        }else if(op.equals("-")){
            return num1 - num2;
        }else if(op.equals("*")){
            return num1 * num2;
        }else {
            return num1/num2;
        }
    }
}
