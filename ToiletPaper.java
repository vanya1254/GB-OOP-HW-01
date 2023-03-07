public class ToiletPaper extends Hygiene {
    private Integer numOfLayers;

    public ToiletPaper(String name, Integer price, Integer quantity, String unit, Integer piecesPerPackage,
            Integer numOfLayers) {
        super(name, price, quantity, unit, piecesPerPackage);
        this.numOfLayers = numOfLayers;
    }

    @Override
    public String toString() {
        return String.format(
                "ToiletPaper{ name=%s, price=%d, quantity=%d, unit=%s, piecesPerPackage=%d, numOfLayers=%d }", name,
                price, quantity, unit, piecesPerPackage, numOfLayers);
    }
}