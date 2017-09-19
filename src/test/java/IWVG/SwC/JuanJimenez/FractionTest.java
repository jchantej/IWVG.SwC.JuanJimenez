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


}
