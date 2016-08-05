class Account {
    private int money;
    Account(int amt) {
        money = amt;
    }
    void withdraw(int amt) {
        if (amt < money) { 
            try {
                Thread.sleep(1000);
                money = money - amt;
            } catch(Exception e){}
        System.out.println(``Received Rs. '' + amt +
        `` by '' + Thread.currentThread().getName());
        }
        else 
        {
            System.out.println(``Sorry '' + 
            Thread.currentThread().getName() + 
            ``, Requested amt Rs.'' + amt + 
            ``is not available.'');
        }
        System.out.println(``Balance Rs. '' + money);
    }
}
public class AccountUpdate implements Runnable {
  Account a;
  int amt;
  public static void main(String str[]){
      Account account = new Account(1000);
      new AccountUpdate(account, ``Ramesh'', 500);
      new AccountUpdate(account, ``Suresh'', 750);
  }
  public AccountUpdate(Account a, String name, int amt)
  {
      this.a = a;
      this.amt = amt;
      new Thread(this, name).start();
  }
  public void run() {
      a.withdraw(amt);
  }
}

