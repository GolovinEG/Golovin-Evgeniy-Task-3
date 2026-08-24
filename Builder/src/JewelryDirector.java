public class JewelryDirector {
    public void buildSimple(JewelryBuilder builder) {
        assert  builder != null : "builder is null";
        builder.setMaterial("brass");
        builder.setGem(null);
        builder.setSize(6);
    }

    public void buildExpensive(JewelryBuilder builder) {
        assert  builder != null : "builder is null";
        builder.setMaterial("silver");
        builder.setGem("pearl");
        builder.setSize(7);
    }

    public void buildExclusive(JewelryBuilder builder) {
        assert  builder != null : "builder is null";
        builder.setMaterial("gold");
        builder.setGem("diamond");
        builder.setSize(9);
    }
}
