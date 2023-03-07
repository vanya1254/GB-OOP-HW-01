public class Hygiene extends Product {
    protected Integer piecesPerPackage;

    public Hygiene(String name, Integer price, Integer quantity, String unit, Integer piecesPerPackage) {
        super(name, price, quantity, unit);
        this.piecesPerPackage = piecesPerPackage;
    }

    @Override
    public String toString() {
        return String.format("Product -> Hygiene{ name=%s, price=%d, quantity=%d, unit=%s, piecesPerPackage=%d }", name, price,
                quantity, unit, piecesPerPackage);
    }
}