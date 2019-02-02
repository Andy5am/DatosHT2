/**
 * Interzas Stack.
 * Contiene todos los metodos que la clase pila implementa para su funcionalidad.
 *
 * @author
 * @since
 * @param <E> valor generico.
 */
public interface Stack<E>{
    /**
     * Método push.
     * agrega el numero leido al vector.
     * @param item el número leido en el main.
     */
    public void push(E item);
    // pre:
    // post: item is added to stack
    // will be popped next if no intervening push
    /**
     * Método pop.
     * Saca un elemento del vector, lo borra al mismo tiempo.
     * @return el elemento que se saco del vector.
     */
    public E pop();
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    /**
     * Método peek.
     * Si el vector no esta vacio, devulve el primer elemnto de el, sin borrarlo.
     * @return el primer elemento del vector.
     */
    public E peek();
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    /**
     * Método empty.
     * verifica si el vector esta vacio.
     * @return si esta o no vacio.
     */
    public boolean empty();
    // post: returns true if and only if the stack is empty
    /**
     * Método size
     * Verifica el tamañoo del vector.
     * @return el tamaño del vector.
     */
    public int size();
    // post: returns the number of elements in the stack}
}
