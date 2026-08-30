public class Ring {
    private final String material;
    private final String gem;
    private final int size;

    public Ring(String material, String gem, Integer size) {
        assert material != null && size != null : "Rind data missing";
        this.material = material;
        this.size = size;
        if (gem == null) {
            this.gem = null;
        } else {
            this.gem = gem.isBlank() ? null : gem;
        }
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

    static public RingBuilder builder() {
        return new RingBuilder();
    }

    @Override
    public String toString() {
        return String.format("size %s %s ring with %s gem", size, material, gem != null ? gem : "no");
    }
}