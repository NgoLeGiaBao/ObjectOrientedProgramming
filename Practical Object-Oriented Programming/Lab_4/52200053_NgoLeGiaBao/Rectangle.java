public class Rectangle {
    private float width;
    private float length;

    public Rectangle () {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle (float width, float length) {
        if (width <= 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
        if (length <= 0) {
            this.length = 1;
        } else {
            this.length = length;
        }
    }
    public float getWidth () {
        return this.width;
    }
    public float getLength () {
        return this.length;
    }
    public float getArea () {
        return this.getLength() * this.getWidth();
    }
    public float getPerimeter () {
        return (this.getLength() + this.getWidth())*2;
    }
    public void setWith (float width) {
        if (width <= 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
    }
    public void setLength (float length) {
        if (length <= 0) {
            this.length = 1;
        } else {
            this.length = length;
        }
    }
    public String toString () {
        return "Rectangle[width: " + this.getWidth() + " length: " + this.getLength() + "]";
    } 
}
