public class FractionArr implements FractionI{
    private int [] members;
    public FractionArr () {
        this.members = new int [2];
        this.members[0] = 1;
        this.members[1] = 1;  
    }
    public FractionArr (int numer, int denom) {
        this.members = new int [2];
        this.members[0] = numer;
        this.members[1] = denom;
    }
    public int getNum (){
        return this.members[0];
    }
    public int getDenom (){
        return this.members[1];
    }
    public void setNum (int numer){
        this.members[0] = numer;
    }
    public void setDenom (int denom){
        this.members[1] = denom;
    }
    public int findGCD (FractionArr f){
        int a = this.members[0];
        int b = this.members[1];
        if (a == b) {
            return a;
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else if (b > a) {
                    b = b - a;
                }
            }
            return a;
        }
    }
    public FractionI add (FractionI f){
        return new FractionArr ((this.members[0] * f.getDenom()) + (f.getNum() * this.members[1]), this.members[1] * f.getDenom());
    }
    public FractionI minus (FractionI f) {
        return new FractionArr ((this.members[0] * f.getDenom()) - (f.getNum() * this.members[1]), this.members[1] * f.getDenom());
    }
    public FractionI times (FractionI f) {
        return new FractionArr (this.members[0] * f.getNum(), this.members[1] * f.getDenom());
    }
    public FractionI simplify () {
        int gcdValue = findGCD(this);
        return new FractionArr (this.members[0]/gcdValue, this.members[1]/gcdValue);
    }
    public String toString () {
        return this.members[0] + "/" + this.members[1];
    }
    public boolean equals (Object obj) {
        if (obj instanceof Fraction) {
           FractionArr f = (FractionArr)obj;
            this.simplify();
            f.simplify();
            if (this.members[0] == f.getNum() && this.members[1] == f.getDenom()) {
                return true;
            }
        } 
        return false;
    }
}