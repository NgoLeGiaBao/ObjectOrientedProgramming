import java.util.*;
import java.io.*;
public class ClientMangementSystem {
    public static void main (String [] args) {
        Client cl = new NormalClient("D","D",101,15);
        try {
            Client vcl = new VipClient("D", "C", 1000, "Vàng");
            Client vcl1 = new VipClient("D", "C", 1000, "CC");
            System.out.println(vcl);
            System.out.println(vcl1);
        } catch (WrongClassOfCard e) {
            System.out.println (e);
            e.printStackTrace();
        }

        // System.out.println (cl.getAccumulatedPoints(500000));
        System.out.println(cl);

    }
}