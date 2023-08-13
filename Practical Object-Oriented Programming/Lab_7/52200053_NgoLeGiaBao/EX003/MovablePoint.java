public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;
    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp (){
        this.y += this.ySpeed;
    }
    public void moveDown () {
        this.y -= this.ySpeed;
    }
    public void moveLeft (){
        this.x -= this.xSpeed;
    }
    public void moveRigth (){
        this.x += this.xSpeed;
    }
    public String toString () {
        return "MoveablePoint[x = " + this.x + ", y = " + this.y + ", Speed x = " + this.xSpeed + ", Speed y = " + this.ySpeed + "]";
    }
}
