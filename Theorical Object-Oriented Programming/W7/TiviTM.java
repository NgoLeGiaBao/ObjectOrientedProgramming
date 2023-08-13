class TiviTM extends Tivi {
    private int generationColor;
    private String screenKind; 
    
    public TiviTM () {
        super ("TV123",40,"Sony",0);
        this.generationColor = 8;
        this.screenKind = "4K";
    }
    public TiviTM (String TvID, int inche, String manufacturerName, double importPrice, int generationColor, String screenKind) {
        super (TvID, inche, manufacturerName, importPrice);
        if (generationColor == 8 || generationColor == 16 || generationColor == 32) {
            this.generationColor = generationColor;
        }else {
            this.generationColor = 16;
        }
        if (screenKind.equals("HD")|| screenKind.equals("4K") || screenKind.equals("QLED")) {
            this.screenKind = screenKind;
        } else {
            this.screenKind = "4K";
        }
    }
    public String toString () {
        return "TiviTM[ID TV = " + this.TvID + ", Inche = " + this.inche + " ,Manufacturer name = " + this.manufacturerName + ", Import price = " + this.importPrice + " , Generation color = " + this.generationColor + " ,Kind screen = " + this.screenKind + " ,Price export = " + this.exportPrice() + "]";  
    }
    public double exportPrice () {
        return this.importPrice * 1.2;
    }
}