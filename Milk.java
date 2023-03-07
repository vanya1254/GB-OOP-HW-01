public class Milk extends Drinks {
    private Double fatContent;
    private String expirationDate;// "dd.mm.yy"

    public Milk(String name, Integer price, Integer quantity, String unit, Double volume, Double fatContent,
            String expirationDate) {
        super(name, price, quantity, unit, volume);
        this.fatContent = fatContent;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Product -> Drinks -> Milk{ name=%s, price=%d, quantity=%d, unit=%s, volume=%2.1f, fatContent=%2.1f, expirationDate=%s }",
                name, price, quantity, unit, volume, fatContent, expirationDate);
    }
}