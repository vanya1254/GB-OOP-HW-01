public class Masks extends Hygiene {

    public Masks(String name, Integer price, Integer quantity, String unit, Integer piecesPerPackage) {
        super(name, price, quantity, unit, piecesPerPackage);
    }

    @Override
    public String toString() {
        return String.format("Masks{ name=%s, price=%d, quantity=%d, unit=%s, piecesPerPackage=%d }", name, price,
                quantity, unit, piecesPerPackage);
    }
}