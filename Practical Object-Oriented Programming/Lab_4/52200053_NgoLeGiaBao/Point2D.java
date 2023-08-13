public class Point2D {
    private float x;
    private float y;

    public Point2D () {
        this.x = 0;
        this.y = 0;
    }
    public Point2D (float x, float y) {
        if (x < 0) {
            this.x = 0;
        } else {
            this.x = x;
        }
        if (y < 0) {
            this.y = 0;
        } else {
            this.y = y;
        }
    }
    public float getX () {
        return this.x;
    }
    public float getY () {
        return this.y;
    }
}