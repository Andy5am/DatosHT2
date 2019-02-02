import static org.junit.jupiter.api.Assertions.*;

class PilaTest {

    @org.junit.jupiter.api.Test
    void push() {
    }

    @org.junit.jupiter.api.Test
    void pop() {
    }

    @org.junit.jupiter.api.Test
    void peek() {
        Pila p = new Pila();
        p.push(1);
        Object esperado = 1;
        Object real = p.peek();
        assertEquals(esperado,real);
    }

    @org.junit.jupiter.api.Test
    void empty() {
        Pila p = new Pila();
        boolean esperado = true;
        boolean real = p.empty();
        assertEquals(esperado,real);
    }

    @org.junit.jupiter.api.Test
    void size() {
        Pila p = new Pila();
        int esperado = 0;
        int real = p.size();
        assertEquals(esperado,real);
    }
}