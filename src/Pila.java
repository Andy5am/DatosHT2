/**
 * Clase Pila.
 * Se encarga de efectuar todos los metodos para agregar y sacar elementos del vector.
 *
 * @author Andy Catillo y Abril Palencia
 * @since  31/01/2019
 */
import java.util.Vector;

/**
 * @param <E> valor generico.
 */
public class Pila<E> implements Stack<E>{
    //crear el objeto calculadora
    Calculator calculator = new MyCalculator();
   Vector<E> vector = new Vector<>();

    /**
     * Método push.
     * agrega el numero leido al vector.
     * @param item el número leido en el main.
     */
    public void push(E item){
       //agregar
        vector.add(item);
    }

    /**
     * Método pop.
     * Saca un elemento del vector, lo borra al mismo tiempo.
     * @return el elemento que se saco del vector.
     */
    public E pop(){
       //sacar
       return vector.remove(vector.size()-1);
    }

    /**
     * Método peek.
     * Si el vector no esta vacio, devulve el primer elemnto de el, sin borrarlo.
     * @return el primer elemento del vector.
     */
    public E peek(){
       //no esta vacia, primer elemento de la pila lo devuelve.
        return vector.get(vector.size()-1);
    }

    /**
     * Método empty.
     * verifica si el vector esta vacio.
     * @return si esta o no vacio.
     */
    public boolean empty(){
    //true si la pila esta vacia.
        return vector.isEmpty();
    }

    /**
     * Método size
     * Verifica el tamañoo del vector.
     * @return el tamaño del vector.
     */
    public int size(){
       //retorna el tamaño de la pila.
        return vector.size();

    }


}
