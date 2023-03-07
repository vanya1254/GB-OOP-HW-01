public class Eggs extends Food {
    private Integer quantityPerPackage;

    public Eggs(String name, Integer price, Integer quantity, String unit, String expirationDate,
            Integer quantityPerPackage) {
        super(name, price, quantityPerPackage, unit, expirationDate);
        this.quantityPerPackage = quantityPerPackage;
    }

    @Override
    public String toString() {
        return String.format(
                "Eggs{ name=%s, price=%d, quantity=%d, unit=%s, expirationDate=%s, quantityPerPackage=%d }", name,
                price, quantity, unit, expirationDate, quantityPerPackage);
    }
}