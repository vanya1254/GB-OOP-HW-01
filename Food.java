public class Food extends Product {
    protected String expirationDate;// "dd.mm.yy"

    public Food(String name, Integer price, Integer quantity, String unit, String expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return String.format("Product -> Food{ name=%s, price=%d, quantity=%d, unit=%s, expirationDate=%s }", name, price,
                quantity, unit, expirationDate);
    }
}