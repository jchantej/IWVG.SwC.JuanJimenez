package IWVG.SwC.JuanJimenez;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {
  
    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException();
        }
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException();
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    
    public double lower() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException();
        }
        double lower = Double.MAX_VALUE;
        for (double item : this.collection) {
            if (item < lower) {
                lower = item;
            }
        }
        return lower;
    }

}
