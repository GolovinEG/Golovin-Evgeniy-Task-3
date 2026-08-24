public interface JewelryBuilder {
    void setMaterial(String material);
    void setGem(String gem);
    void setSize(Integer size);

    static boolean isNullOrBlank(String str) {
        if (str == null) {
            return true;
        }
        return str.isBlank();
    }
}
