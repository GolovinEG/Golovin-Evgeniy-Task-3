public class RingBuilder implements JewelryBuilder{
    private String material;
    private String gem;
    private int size;

    @Override
    public void setMaterial(String material) {
        assert material != null : "material data is null";
        this.material = material;
    }

    @Override
    public void setGem(String gem) {
        this.gem = JewelryBuilder.isNullOrBlank(gem) ? null : gem;
    }

    @Override
    public void setSize(Integer size) {
        assert size != null : "size data is null";;
        this.size = size;
    }

    public Ring getRing() {
        return new Ring(material, gem, size);
    }
}
