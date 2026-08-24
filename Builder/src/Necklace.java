public class Necklace {
    private final String material;
    private final String gem;
    private final int size;

    public Necklace(String material, String gem, Integer size) {
        assert material != null && size != null : "Necklace data missing";
        this.material = material;
        this.gem = gem;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public String getGem() {
        return gem != null ? gem : "no gem";
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("size %s %s necklace with %s gem", size, material, gem != null ? gem : "no");
    }
}
