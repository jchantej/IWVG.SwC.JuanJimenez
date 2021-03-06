package IWVG.SwC.JuanJimenez;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de
 * la primera por denominador de la segunda) es igual al producto de medios
 * (denominador de la primera por el numerador de la segunda)
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre sí
 * 
 * Reducir varias fracciones a común denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a común
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La división de dos fracciones es otra fracción que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public double decimal() {
        return (double) getNumerator() / denominator;
    }
    
    public boolean isPropia() {
        return Math.abs(this.numerator) < Math.abs(this.denominator);
    }

    public Fraction sum(Fraction f1, Fraction f2) {
        Fraction f3 = new Fraction();
        f3.numerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        f3.denominator = f1.denominator * f2.denominator;
        return f3;
    }

    public double multiplicacion(Fraction fractionA, Fraction fractionB) {

        double num2 = fractionA.getNumerator() * (double) fractionB.getNumerator();
        double den2 = fractionA.getDenominator() * (double) fractionB.getDenominator();

        return num2 /  (double)den2;
    }
    
}
