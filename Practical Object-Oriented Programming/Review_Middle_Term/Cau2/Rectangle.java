import java.lang.Math;
public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len){
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public double getWidth(){
       return this.width;
    }
    public double getLength(){
        return this.length;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter(){
        return (this.width + this.length)*2;
    }

    public String getType(){
        if (this.getPerimeter() >= 10) {
            return "A"; 
        } else if (this.getPerimeter() >= 5) {
            return "B";
        } else {
            return "C";
        }
    }
	
	public boolean isSquare(){
        return this.length == this.width;
    }

    public double calDiagonalLine(){
        return Math.sqrt((this.width * this.width) + (this.length * this.length));
    }

    public Rectangle resize(double rate){
         double newWidth = this.width * rate;
         double newLength = this.length * rate;
         return new Rectangle (this.name, this.color, newWidth, newLength); 
    }

    public String toString(){
        return "Rectangle["+this.getName()+", " + this.getWidth()+", " + this.getLength() + ", "+this.getPerimeter()+ ", "+ this.getType()+"]";

    }
}