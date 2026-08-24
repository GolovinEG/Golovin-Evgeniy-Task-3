public class Ring {
    private final String material;
    private final String gem;

    public Ring(String material, String gem) {
        assert material != null : "The material argument is null";
        this.material = material;
        if (gem.isBlank()) {
            this.gem = "no";
        } else {
            this.gem = gem;
        }
    }

    public String getMaterial() {
        return material;
    }

    public String getGem() {
        return gem;
    }

    @Override
    public String toString() {
        return String.format("%s ring with %s gem.", material, gem);
    }
}
