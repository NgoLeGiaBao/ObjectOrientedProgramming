public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction () {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }
    public Fraction (Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }
    public Fraction add (Fraction f) {
        int numerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        int denominator = this.denominator * f.denominator;
        return new Fraction (numerator, denominator);
    }
    public Fraction sub (Fraction f) {
        int numerator = (this.numerator * f.denominator) - (f.numerator * this.denominator);
        int denominator = this.denominator * f.denominator;
        return new Fraction (numerator, denominator);
    }
    public Fraction mul (Fraction f) {
        int numerator = this.numerator * f.numerator;
        int denominator = this.denominator * f.denominator;
        return new Fraction (numerator, denominator);
    }
    public Fraction div (Fraction f) {
        int numerator = this.numerator * f.denominator;
        int denominator = this.denominator * f.numerator;
        return new Fraction (numerator, denominator);
    }
    public void reducer () {
        int UCLN;
        int a = this.numerator;
        int b = this.denominator;
        if (a == 0) {
            UCLN = this.numerator;
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            UCLN = a;
        }
        this.numerator /= UCLN;
        this.denominator /= UCLN;

    }

    public String toString () {
        return "Fraction [num = " + this.numerator + ", dem = " + this.denominator +"]";
    }
}