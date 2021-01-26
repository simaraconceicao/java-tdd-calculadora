import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {
    @Test
    public void shouldBeAbleToSumTwoNumbers() throws Exception {
        int valueA = 10;
        int valueB = 5;

        Calculadora calculadora = new Calculadora();
        int sum = calculadora.sum(valueA, valueB);

        assertEquals(15, sum);

    }

    @Test
    public void shouldBeAbleToSubtractTwoNumbers() throws Exception {
        int valueA = 10;
        int valueB = 5;

        Calculadora calculadora = new Calculadora();
        int sub = calculadora.sub(valueA, valueB);

        assertEquals(5, sub);
    }

    @Test
    public void shouldBeAbleToMutiplyTwoNumbers() throws Exception {
        int valueA = 10;
        int valueB = 5;

        Calculadora calculadora = new Calculadora();
        int mult = calculadora.mult(valueA, valueB);

        assertEquals(50, mult);
    }

    @Test
    public void shouldBeAbleToDividTwoNumbers() throws Exception {
        int valueA = 10;
        int valueB = 5;

        Calculadora calculadora = new Calculadora();
        int div = calculadora.div(valueA, valueB);

        assertEquals(2, div);
    }

}
