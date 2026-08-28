public class RingBuilder {
    private String material;
    private String gem;
    private int size;

    public RingBuilder material(String material) {
        assert material != null : "material data is null";
        this.material = material;
        return this;
    }

    public RingBuilder gem(String gem) {
        if (gem == null) {
            this.gem = null;
        } else {
            this.gem = gem.isBlank() ? null : gem;
        }
        return this;
    }

    public RingBuilder size(Integer size) {
        assert size != null : "size data is null";
        this.size = size;
        return this;
    }

    public Ring build() {
        return new Ring(material, gem, size);
    }
}