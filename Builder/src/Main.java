public class Main {
    public static void main(String[] args) {
        final RingBuilder ringBuilder = new RingBuilder();
        final NecklaceBuilder necklaceBuilder = new NecklaceBuilder();
        final JewelryDirector director = new JewelryDirector();
        director.buildSimple(ringBuilder);
        System.out.println(ringBuilder.getRing());
        director.buildSimple(necklaceBuilder);
        System.out.println(necklaceBuilder.getNecklace());
        director.buildExpensive(ringBuilder);
        System.out.println(ringBuilder.getRing());
        director.buildExclusive(necklaceBuilder);
        System.out.println(necklaceBuilder.getNecklace());
    }
}
