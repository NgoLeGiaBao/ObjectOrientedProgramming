public class Test {
    public static void main (String args[]) {
        ImageLoader il1 = ImageLoader.getInstance();
        System.out.println (il1.loadImage());

        ImageLoader il2 = ImageLoader.getInstance();
        System.out.println (il2.loadImage());
    }
}