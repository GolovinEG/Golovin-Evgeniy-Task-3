public class Main {
    public static void main(String[] args) {
        final Ring ring = Ring.builder()
                .material("silver")
                .gem("sapphire")
                .size(8).build();
        System.out.println(ring);
    }
}