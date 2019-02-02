import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @Test
    void calculate() {
        MyCalculator c = new MyCalculator();
        int esperado = 0;
        int real = c.calculate(5,3,"+");
        assertEquals(esperado,real);
    }
}