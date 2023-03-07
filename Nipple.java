public class Nipple extends Children {

    public Nipple(String name, Integer price, Integer quantity, String unit, Integer minAge, Boolean hypoallergenic) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return String.format("Children{ name=%s, price=%d, quantity=%d, unit=%s, minAge=%d, hypoallergenic=%b }", name,
                price, quantity, unit, minAge, hypoallergenic);
    }
}