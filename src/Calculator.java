/**
 * Interzas Calculator
 * Se encarga de efectuar las operaciónes disponnibles del probrama y los devuelve.
 *
 * @author Andy Castillo y Abril Palencia
 * @since 31/01/2019
 */
public interface Calculator {
    /**
     * Método calculate
     * recibe los numeros y efectua la operacion respectiva para cada operando.
     * @param num1 primer numero en la pila.
     * @param num2 segundo numero en la pila.
     * @param op operador recibido.
     * @return devuelve el resultado de la operación.
     */
    public int calculate(int num1, int num2,String op);
}
