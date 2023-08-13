public class Fraction implements FractionI{
    private int numer;
    private int denom;

    public Fraction () {
        this.numer = 1;
        this.denom = 1;
    }
    public Fraction (int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public int getNum () {
        return this.numer;       
    }
    public int getDenom () {
        return this.denom;
    }
    public void setNum (int numer) {
        this.numer = numer;
    }
    public void setDenom (int denom){
        this.denom = denom;
    }
    public int findGCD (Fraction f){
        int a = f.numer;
        int b = f.denom;
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
        return new Fraction ((this.numer * f.getDenom()) + (f.getNum() * this.denom), this.denom * f.getDenom());
    }
    public FractionI minus (FractionI f) {
        return new Fraction ((this.numer * f.getDenom()) - (f.getNum() * this.denom), this.denom * f.getDenom());
    }
    public FractionI times (FractionI f) {
        return new Fraction (this.numer * f.getNum(), this.denom * f.getDenom());
    }
    public FractionI simplify () {
        int gcdValue = findGCD(this);
        return new Fraction (this.numer/gcdValue, this.denom/gcdValue);
    }
    public String toString () {
        return this.numer + "/" + this.denom;
    }
    public boolean equals (Object obj) {
        if (obj instanceof Fraction) {
           Fraction f = (Fraction)obj;
            this.simplify();
            f.simplify();
            if (this.numer == f.getNum() && this.denom == f.getDenom()) {
                return true;
            }
        } 
        return false;
    }
}