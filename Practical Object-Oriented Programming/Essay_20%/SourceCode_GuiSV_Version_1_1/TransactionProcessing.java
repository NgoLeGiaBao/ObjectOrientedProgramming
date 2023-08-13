import java.util.*;
import java.io.*;
import java.time.Year;
public class TransactionProcessing {
    private ArrayList<Payment> paymentObjects;
    private IDCardManagement idcm;
    
    public TransactionProcessing(String idCardPath, String paymentPath) {
        idcm = new IDCardManagement(idCardPath);
        readPaymentObject(paymentPath);
    
    }
    public ArrayList<Payment> getPaymentObject() {
        return this.paymentObjects;
    }
    // Requirement 3
    public boolean readPaymentObject(String path) {
        File f = new File (path);
        paymentObjects = new ArrayList<Payment>();
        try {
			Scanner sc = new Scanner (f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String [] dataArr = data.split(",");
                if (dataArr.length == 2) {
                    this.paymentObjects.add(new BankAccount(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1])));
                } else {
                    if (dataArr[0].length() == 7) {
                        this.paymentObjects.add(new EWallet(Integer.parseInt(dataArr[0])));
                    } else if (dataArr[0].length() == 6) {
                        for (IDCard idCard : idcm.getIDCards()) {
                            String idNumberString = idCard.getIDNumber()+"";
                            if (idNumberString.equals(dataArr[0])) {
                                try {
                                    this.paymentObjects.add(new ConvenientCard(idCard));
                                } catch (CannotCreateCard e) {
                                    System.out.println(e);
                                }
                            }
                        } 
                    }
                }
            }
            sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
            return false;
		}
        return true;
    }

    // Requirement 4
    public ArrayList<IDCard> existInConvenientCardReq4(ArrayList<IDCard> listIDCard, ArrayList<ConvenientCard> listCC) {
        ArrayList <IDCard> existCC = new ArrayList <IDCard> ();
        for (ConvenientCard cc : listCC) {
            for (IDCard idCard : listIDCard) {
                if ((cc.getIDCard().getIDNumber()+"").equals(idCard.getIDNumber()+"")) {
                    existCC.add(idCard);
                    break;
                }
            }
        }
        return existCC;
    }
    public ArrayList<ConvenientCard> getAdultConvenientCards() {
        ArrayList <ConvenientCard> listCCReturn = new ArrayList <ConvenientCard> ();
        ArrayList <IDCard> listIDCard = new ArrayList <IDCard>();
        ArrayList <ConvenientCard> listCC = new ArrayList <ConvenientCard>();
        ArrayList <BankAccount> listBA = new ArrayList <BankAccount>();
        ArrayList <EWallet> listEW = new ArrayList <EWallet>();

        for (Payment py : this.getPaymentObject()) {
            if (py instanceof ConvenientCard) {
                listCC.add((ConvenientCard)py);
            } else if (py instanceof BankAccount) {
                listBA.add((BankAccount)py);
            } else if (py instanceof EWallet) {
                listEW.add((EWallet)py);
            }
        }
        for (IDCard idCard : existInConvenientCardReq4(idcm.getIDCards(), listCC)) {
            try {
                ConvenientCard cc = new ConvenientCard (idCard);
                if (cc.getType().equals("Adult")) {
                    listCCReturn.add(cc);
                }
            } catch (CannotCreateCard e) {
                System.out.println(e);
            }
        }
        return listCCReturn;
    }

    // Requirement 5
    public boolean checkContainIDNumber (ArrayList<BankAccount> listBA, String IDNumber) {
        for (BankAccount ba: listBA) {
            if ((ba.getAccountNumber()+"").equals(IDNumber)) {
                return true;
            }
        }
        return false;
    }
    public boolean checkContainPhoneNumber (ArrayList<EWallet> listEW,String phoneNumber) {
        for (EWallet ew : listEW) {
            if ((ew.getPhoneNumber()+"").equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<IDCard> existInConvenientCardReq5(ArrayList<IDCard> listIDCard, ArrayList<ConvenientCard> listCC) {
        ArrayList <IDCard> existCC = new ArrayList <IDCard> ();
        for (IDCard idCard : listIDCard) {
            for (ConvenientCard cc : listCC) {
                if ((cc.getIDCard().getIDNumber()+"").equals(idCard.getIDNumber()+"")) {
                    existCC.add(idCard);
                    break;
                }
            }
        }
        return existCC;
    }
    public ArrayList<IDCard> getCustomersHaveBoth() {
        ArrayList <IDCard> listIDCard = new ArrayList <IDCard>();
        ArrayList <ConvenientCard> listCC = new ArrayList <ConvenientCard>();
        ArrayList <BankAccount> listBA = new ArrayList <BankAccount>();
        ArrayList <EWallet> listEW = new ArrayList <EWallet>();

        for (Payment py : this.getPaymentObject()) {
            if (py instanceof ConvenientCard) {
                listCC.add((ConvenientCard)py);
            } else if (py instanceof BankAccount) {
                listBA.add((BankAccount)py);
            } else if (py instanceof EWallet) {
                listEW.add((EWallet)py);
            }
        }
        for (IDCard idCard: existInConvenientCardReq5(idcm.getIDCards(),listCC)) {
            String IDNumber = idCard.getIDNumber() + "";
            String phoneNumber = idCard.getPhoneNumber()+"";
            if (checkContainIDNumber(listBA,IDNumber) && checkContainPhoneNumber(listEW, phoneNumber)){
                listIDCard.add(idCard);
            }
        }
        return listIDCard;
    }

    // Requirement 6
    public void processTopUp(String path) {
        ArrayList <ConvenientCard> listCC = new ArrayList <ConvenientCard>();
        ArrayList <BankAccount> listBA = new ArrayList <BankAccount>();
        ArrayList <EWallet> listEW = new ArrayList <EWallet>();

        for (Payment py : this.getPaymentObject()) {
            if (py instanceof ConvenientCard) {
                listCC.add((ConvenientCard)py);
            } else if (py instanceof BankAccount) {
                listBA.add((BankAccount)py);
            } else if (py instanceof EWallet) {
                listEW.add((EWallet)py);
            }
        }
        File f = new File (path);
        try {
            Scanner sc = new Scanner (f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String [] dataArr = data.split(",");
                if (dataArr[0].equals("CC")) {
                    for (ConvenientCard cc : listCC) {
                        if ((cc.getIDCard().getIDNumber()+"").equals(dataArr[1])) {
                            cc.topUp(Double.parseDouble(dataArr[2]));
                        }
                    }
                } else if (dataArr[0].equals("BA")) {
                    for (BankAccount ba : listBA) {
                        if ((ba.getAccountNumber()+"").equals(dataArr[1])) {
                            ba.topUp(Double.parseDouble(dataArr[2]));
                        }
                    }
                } else if (dataArr[0].equals("EW")) {
                    for (EWallet ew : listEW) {
                        if ((ew.getPhoneNumber()+"").equals(dataArr[1])) {
                            ew.topUp(Double.parseDouble(dataArr[2]));
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Requirement 7
    public ArrayList<Bill> getUnsuccessfulTransactions(String path) {
        ArrayList <Bill> listBill = new ArrayList<Bill>();
        ArrayList <ConvenientCard> listCC = new ArrayList <ConvenientCard>();
        ArrayList <BankAccount> listBA = new ArrayList <BankAccount>();
        ArrayList <EWallet> listEW = new ArrayList <EWallet>();
        for (Payment py : this.getPaymentObject()) {
            if (py instanceof ConvenientCard) {
                listCC.add((ConvenientCard)py);
            } else if (py instanceof BankAccount) {
                listBA.add((BankAccount)py);
            } else if (py instanceof EWallet) {
                listEW.add((EWallet)py);
            }
        }
        File f = new File (path);
        try {
            Scanner sc = new Scanner (f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String [] dataArr = data.split(",");
                if (dataArr[3].equals("BA")) {
                    for (BankAccount ba : listBA) {
                        if ((ba.getAccountNumber()+"").equals(dataArr[4])) {
                            if(!(ba.pay(Double.parseDouble(dataArr[1])))) {
                                listBill.add(new Bill(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1]),dataArr[2]));
                            }
                        }
                    }
                } else if (dataArr[3].equals("EW")) {
                    for (EWallet ew : listEW) {
                        if ((ew.getPhoneNumber()+"").equals(dataArr[4])) {
                            if(!(ew.pay(Double.parseDouble(dataArr[1])))) {
                                listBill.add(new Bill(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1]),dataArr[2]));
                            }
                        }
                    }
                }else if (dataArr[3].equals("CC")) {
                    for (ConvenientCard cc : listCC) {
                        if ((cc.getIDCard().getIDNumber()+"").equals(dataArr[4])) {
                            if (!(cc.pay(Double.parseDouble(dataArr[1])))) {
                                listBill.add(new Bill(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1]),dataArr[2]));
                            }
                        }
                    }
                } 
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listBill;
    }

    // Requirement 8
    public ArrayList<BankAccount> getLargestPaymentByBA(String path) {
        ArrayList <BankAccount> listLargestPayment = new ArrayList <BankAccount>();
        ArrayList <String> listIDAccount = new ArrayList<String>();
        ArrayList <Double> moneyTransaction = new ArrayList<Double>(); 
        ArrayList <BankAccount> listBA = new ArrayList <BankAccount>();

        for (Payment py : this.getPaymentObject()) {
            if (py instanceof BankAccount) {
                listBA.add((BankAccount)py);
            }
        }
        File f = new File (path);
        try {
            Scanner sc = new Scanner (f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String [] dataArr = data.split(",");
                if (dataArr[3].equals("BA")) {
                    for (BankAccount ba : listBA) {
                        if ((ba.getAccountNumber()+"").equals(dataArr[4])) {
                            if((ba.pay(Double.parseDouble(dataArr[1])))) {
                               if (listIDAccount.contains(dataArr[4])) {
                                    int index = listIDAccount.indexOf(dataArr[4]);
                                    double money = moneyTransaction.get(index);
                                    moneyTransaction.set(index, money + Double.parseDouble(dataArr[1]));
                               } else {
                                    listIDAccount.add(dataArr[4]);
                                    moneyTransaction.add(Double.parseDouble(dataArr[1]));
                               }
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double largestPayment = 0;
        for (double money : moneyTransaction) {
            if (money > largestPayment) {
                largestPayment = money;
            }
        }
        for (int i = 0; i < moneyTransaction.size(); i++) {
            if (moneyTransaction.get(i) == largestPayment) {
                for (BankAccount ba : listBA) {
                    if ((ba.getAccountNumber()+"").equals(listIDAccount.get(i))) {
                        listLargestPayment.add(ba);
                    } 
                }
            }
        }
        return listLargestPayment;
    }

    //Requirement 9
    public void processTransactionWithDiscount(String path) {
        ArrayList <ConvenientCard> listCC = new ArrayList <ConvenientCard>();
        ArrayList <BankAccount> listBA = new ArrayList <BankAccount>();
        ArrayList <EWallet> listEW = new ArrayList <EWallet>();
        for (Payment py : this.getPaymentObject()) {
            if (py instanceof ConvenientCard) {
                listCC.add((ConvenientCard)py);
            } else if (py instanceof BankAccount) {
                listBA.add((BankAccount)py);
            } else if (py instanceof EWallet) {
                listEW.add((EWallet)py);
            }
        }
        File f = new File (path);
        try {
            Scanner sc = new Scanner (f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String [] dataArr = data.split(",");
                double amountMoney = Double.parseDouble(dataArr[1]);
                String kindProduct = dataArr[2];
                if (dataArr[3].equals("BA")) {
                    for (BankAccount ba : listBA) {
                        if ((ba.getAccountNumber()+"").equals(dataArr[4])){
                            ba.pay(amountMoney);
                        }
                    }
                } else if (dataArr[3].equals("EW")) {
                    for (EWallet ew : listEW) {
                        if ((ew.getPhoneNumber()+"").equals(dataArr[4])){
                            if (amountMoney > 500 && kindProduct.equals("Clothing")) {
                                ew.pay(amountMoney * 0.85);
                            } else {
                                ew.pay(amountMoney);
                            }
                            
                        }
                    }
                } else if (dataArr[3].equals("CC")) {
                    for (ConvenientCard cc : listCC) {
                        if ((cc.getIDCard().getIDNumber()+"").equals(dataArr[4])){
                            int age = Integer.parseInt(Year.now()+"") - Integer.parseInt(cc.getIDCard().getDate().split("/")[2]);
                            String sex = cc.getIDCard().getSex();
                            if (((age < 18 && sex.equals("Female") || (age < 20 && sex.equals("Male")))) && (amountMoney > 500 && kindProduct.equals("Clothing"))) {
                                cc.pay(amountMoney * 0.85);
                            } else {
                                cc.pay(amountMoney);
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
