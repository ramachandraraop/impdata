public class GCTest {
    public static void main(String[] args) throws InterruptedException {
        ColorCode colorCode = new ColorCode(``white'');
        for (int i = 0; i < 10000000; i++) {
            if (i % 2 == 1) {
                colorCode = new ColorCode(``red'');
            } else {
                colorCode = new ColorCode(``green'');
            }
            colorCode = null;
        }
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
