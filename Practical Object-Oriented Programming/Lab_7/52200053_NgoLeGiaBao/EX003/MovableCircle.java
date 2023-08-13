import java.lang.Math;
public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;
    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void caculateRadius() {
        this.radius = (int)Math.sqrt((Math.pow(this.center.x,2.0)) + (Math.pow(this.center.y,2.0)));
    }
    public void moveUp (){
        this.center.moveUp();
        this.caculateRadius();
    }
    public void moveDown (){
        this.center.moveDown();
        this.caculateRadius();
    }
    public void moveLeft (){
        this.center.moveLeft();
        this.caculateRadius();
    }
    public void moveRigth (){
        this.center.moveRigth();
        this.caculateRadius();
    }
    public String toString () {
        return "MoveableCircle[x = " + this.center.x + ", y = " + this.center.y + ", Speed x = " + this.center.xSpeed + ", Speed y = " + this.center.ySpeed + ", Radius = " + this.radius + "]";
    }
}
