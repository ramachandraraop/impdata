public class RuntimeGCTest {
    public static void main(String[] args) throws InterruptedException {
        ColorCode colorCode = new ColorCode(``white'');
        colorCode = null;
        Runtime.getRuntime().gc();
    }
}
 
class ColorCode {
    private String color;
    public ColorCode(String color) {
        this.color = color;
    }
 
    @Override
    public void finalize() {
        System.out.println(this.color + `` cleaned'');
    }
}
