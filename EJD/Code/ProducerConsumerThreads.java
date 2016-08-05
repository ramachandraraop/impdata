class Customer {
   int amount = 0;
   int flag = 0;
   public synchronized int withdraw(int amount)  {
     
   System.out.println(Thread.currentThread().getName() + 
   ``is going to withdraw'');
     if (flag == 0) {
         try {
             System.out.println(``Waiting...'');
             wait();
         } catch(Exception e) {}
     }
      this.amount -= amount;
      System.out.println(``Withdraw Complete'');
      return amount;
   }
   public synchronized void deposit(int amount) {
     System.out.println(Thread.currentThread().getName() +
     `` is going to deposit'');
     this.amount += amount;
     notifyAll();
     System.out.println(``Deposit Complete'');
     flag = 1;
   }
}
class ProducerConsumerThreads {
   public static void main(String args[]) {
      final Customer customer = new Customer();
      Thread one = new Thread() {
          public void run() {
            customer.withdraw(5000);
            System.out.println(``Balance Rs. '' + 
                                 customer.amount);
          }
      };
      Thread two = new Thread() {
          public void run() {
              customer.deposit(10000);
              System.out.println(``Deposited amount Rs. ''+
                                   customer.amount);
           }
       };
       one.start();
       two.start();
    }
}
