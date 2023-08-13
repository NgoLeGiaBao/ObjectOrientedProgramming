class Tivi {
    protected String TvID;
    protected int inche;
    protected String manufacturerName;
    protected double importPrice;

    public Tivi () {
        this.TvID = "TV123";
        this.inche = 40;
        this.manufacturerName = "Sony";
    }
    public Tivi (String TvID, int inche, String manufacturerName, double importPrice) {
        this.TvID = TvID;
        if (inche == 32 || inche == 40 || inche == 43 || inche == 49 || inche == 53 || inche == 55) {
            this.inche = inche;
        } else {
            this.inche = 32;
        }
        this.manufacturerName = manufacturerName;
        this.importPrice = importPrice;
    }
    public String toString () {
        return "Tivi[ID TV = " + this.TvID + ", Inche = " + this.inche + " ,Manufacturer name = " + this.manufacturerName + ", Import price = " + this.importPrice + "]";  
    }
}