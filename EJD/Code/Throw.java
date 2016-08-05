class LessBalance extends Exception {
    private String message;
    public LessBalance(String message) {
        this.message = message;
    }
    public String toString() {   //it executes when object is used in output statement Statement
        return message;
    }
}
class Bank {
    private int cust_id;
    private String cust_name;
    private double balance;
    public void getDetails(int cust_id, String cust_name, double balance) {
        try {
            if (balance < 1000) {     
                throw new LessBalance(``Insufficient Balance'');
            } else {
                this.cust_id = cust_id;
                this.cust_name = cust_name;
                this.balance = balance;
            }
        } catch(LessBalance e) {
            System.out.println(``Exception: '' + e);
        }      
    }
    public void showDetails() {
        System.out.println(``Customer Id: '' + cust_id);
        System.out.println(``Customer Name: '' + cust_name);
        System.out.println(``Customer Balance : '' + balance);
    }
}
public class MyException {
    public static void main(String args[]) {
        Bank customer1 = new Bank();
        System.out.println(``Details of customer1'');
        customer1.getDetails(100, ``Miller'', 9999.99);	        
        customer1.showDetails();
        Bank customer2 = new Bank();	  
        System.out.println(``Details of customer2'');
        customer2.getDetails(101, ``Smith'', 999.99);	         
        customer2.showDetails();
    }
}
