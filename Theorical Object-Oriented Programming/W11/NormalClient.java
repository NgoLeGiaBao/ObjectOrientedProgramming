public class NormalClient extends Client {
    private int accumulatedPointsMonthExpired;
    public NormalClient (String clientID, String clientName, int accumulatedPoints, int accumulatedPointsMonthExpired) {
        super (clientID, clientName, accumulatedPoints);
        this.accumulatedPointsMonthExpired = accumulatedPointsMonthExpired;
        // this.getAccumulatedPoints(500000);
    }
    public int getAccumulatedPoints (int moneyBuying) {
        int times = moneyBuying / 10000;
        if ((this.accumulatedPoints > 100) && (this.accumulatedPointsMonthExpired > 12)) {
            this.accumulatedPoints += (times * 2);
        } else {
            this.accumulatedPoints += (times);
        }
        return this.accumulatedPoints;
    }
    public String toString () {
        return "Normal Client [" + super.toString() + " - Month expired = " + this.accumulatedPointsMonthExpired + "]";
    }
}