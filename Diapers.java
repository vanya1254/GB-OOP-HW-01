public class Diapers extends Children {
    private Integer piecesPerPackage;
    private Double minWeight;
    private Double maxWeight;
    private String type;

    public Diapers(String name, Integer price, Integer quantity, String unit, Integer minAge, Boolean hypoallergenic,
            Integer piecesPerPackage, Double minWeight, Double maxWeight, String type) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
        this.piecesPerPackage = piecesPerPackage;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(
                "Diapers{ name=%s, price=%d, quantity=%d, unit=%s, minAge=%d, hypoallergenic=%b, piecesPerPackage=%d, minWeight=%2.1f, maxWeight=%2.1f, type=%s }",
                name, price, quantity, unit, minAge, hypoallergenic, piecesPerPackage, minWeight, maxWeight, type);
    }
}