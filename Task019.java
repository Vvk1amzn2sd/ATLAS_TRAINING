

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
public class Task019 {
   

    public static void main(String[] args) {

        System.out.println("Element w/ label 'H': " + Element.valueOfLabel("Hydrogen"));
        System.out.println("Element w/ atomic number 1: " + Element.valueOfAtomicNumber(1));
        System.out.println("Element w/ atomic weight 4.0026: " + Element.valueOfAtomicWeight(4.0026f));
   
        System.out.println(Element.valueOfAtomicNumber(1));

        // all contenets

        System.out.println(" BY_LABEL map: " + Element.BY_LABEL);
        System.out.println("BY_ATOMIC_NUMBER map: " + Element.BY_ATOMIC_NUMBER);
        System.out.println("BY_ATOMIC_WEIGHT map: " + Element.BY_ATOMIC_WEIGHT);
        for(Element e : Element.values()) {
            System.out.println(e.label + " -> " + e.atomicNumber + " -> " + e.atomicWeight);
        }

    }

   
public enum Element {

    H("Hydrogen", 1, 1.008f),

    HE("Helium", 2, 4.0026f),

    // ...

    NE("Neon", 10, 20.180f);

    private static final Map<String, Element> BY_LABEL = new HashMap<>();

    private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>();

    private static final Map<BigDecimal, Element> BY_ATOMIC_WEIGHT = new HashMap<>();

    static {

        for (Element e : values()) {
           
            BY_LABEL.put(e.label, e);

            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);

            BY_ATOMIC_WEIGHT.put(BigDecimal.valueOf(e.atomicWeight), e);

        }

    }

    public final String label;

    public final int atomicNumber;

    public final float atomicWeight;

    private Element(String label, int atomicNumber, float atomicWeight) {

        this.label = label;

        this.atomicNumber = atomicNumber;

        this.atomicWeight = atomicWeight;

    }

    public static Element valueOfLabel(String label) {

        return BY_LABEL.get(label);

    }

    public static Element valueOfAtomicNumber(int number) {

        return BY_ATOMIC_NUMBER.get(number);

    }

    public static Element valueOfAtomicWeight(float weight) {

        return BY_ATOMIC_WEIGHT.get(BigDecimal.valueOf(weight));

    }

}
}