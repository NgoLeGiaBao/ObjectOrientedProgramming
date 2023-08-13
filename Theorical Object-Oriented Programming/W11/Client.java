public abstract class Client {
    protected String clientID;
    protected String clientName;
    protected int accumulatedPoints;
    public Client (String clientID, String clientName, int accumulatedPoints) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.accumulatedPoints = accumulatedPoints;
    }
    public abstract int getAccumulatedPoints (int moneyBuying); 
    public String toString () {
        return "ID client = " + this.clientID + " - Name client = " + this.accumulatedPoints + " - Accumulated Point = " + this.accumulatedPoints;
    }
}