public class ImageLoader {
    private static ImageLoader imageLoader = null;
    public static ImageLoader getInstance () {
        if (imageLoader == null) {
            imageLoader = new ImageLoader();
        }
        return imageLoader;
    }
    public String loadImage () {
        return "Loaded successfully";
    }
}