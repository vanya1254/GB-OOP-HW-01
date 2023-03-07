public class Bread extends Food {
    private String typeOfFlour;

    public Bread(String name, Integer price, Integer quantity, String unit, String expirationDate, String typeOfFlour) {
        super(name, price, quantity, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return String.format("Product -> Food -> Bread{ name=%s, price=%d, quantity=%d, unit=%s, expirationDate=%s, typeOfFlour=%s }",
                name, price, quantity, unit, expirationDate, typeOfFlour);
    }
}