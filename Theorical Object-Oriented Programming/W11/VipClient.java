import java.util.*;
import java.io.*;
public class VipClient extends Client{
    private String rankCard;
    public VipClient (String clientID, String clientName, int accumulatedPoints, String rankCard) throws WrongClassOfCard {
        super (clientID, clientName, accumulatedPoints);
        if (rankCard.equals("Vàng") || rankCard.equals("Bạc") || rankCard.equals("Kim cương")) {
            this.rankCard = rankCard;
        } else {
            throw new WrongClassOfCard ("WrongClassOfCard is not valid");
        }
    }
    public int getAccumulatedPoints (int moneyBuying) {
        int times = moneyBuying / 10000;
        if (this.rankCard.equals("Bạc")) {
            this.accumulatedPoints += (times*2);
        } else if (this.rankCard.equals("Vàng")) {
            this.accumulatedPoints += (times*3);
        } else if (this.rankCard.equals("Kim Cương")) {
            this.accumulatedPoints += (times *4);
        }
        return this.accumulatedPoints;
    }
    public String toString () {
        return "Vip Client [" + super.toString() + " - Rank card = " + this.rankCard + "]";
    }
}
class WrongClassOfCard extends Exception {
    public WrongClassOfCard (String msg) {
        super (msg);
    }
}