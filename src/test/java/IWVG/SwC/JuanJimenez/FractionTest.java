package IWVG.SwC.JuanJimenez;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    
   //private Fraction fractionA;
   private Fraction fraction;
    
    @Before
    public void before(){
        this.fraction = new Fraction(3,5);

     }
    

    @Test
    public void testFractionIntInt() {
       assertEquals(3, fraction.getNumerator());
       assertEquals(5, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        fraction = new Fraction(5,10);
        assertEquals(0.5, fraction.decimal(), 10e-5);
    }
    
    @Test
    public void testIsPropia() {
        fraction = new Fraction(3,7);
        assertEquals(true, fraction.isPropia());
        fraction = new Fraction(9,2);
        assertEquals(false, fraction.isPropia());
        fraction = new Fraction(3,-7);
        assertEquals(true, fraction.isPropia());
    }
    
    @Test
    public void testSum() {
        assertEquals(7, fraction.sum(new Fraction(1,4), new Fraction(1,3)).getNumerator());
        assertEquals(12, fraction.sum(new Fraction(1,4), new Fraction(1,3)).getDenominator());
    }



}
