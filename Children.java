public class Children extends Product {
    protected Integer minAge;
    protected Boolean hypoallergenic;

    public Children(String name, Integer price, Integer quantity, String unit, Integer minAge, Boolean hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return String.format("Product -> Children{ name=%s, price=%d, quantity=%d, unit=%s, minAge=%d, hypoallergenic=%b }", name,
                price, quantity, unit, minAge, hypoallergenic);
    }
}