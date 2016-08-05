public class DollDaemon extends Thread {
    public void run() {
        while(true) {
          try {
              System.out.println(``Have a nice day'');
              Thread.sleep(1000);
          } catch(InterruptedException e) { 
             break; 
          }
        }
    }
    public static void main(String args[]) {
        DollDaemon doll = new DollDaemon();
        doll.setDaemon(true);
        doll.start();
        char c[] = {`H', `A', `I'};
        int i = 0;
        try {
            while (i < 3) {
                System.out.print(c[i++] + `` '');
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {}
        System.out.println(``End of main method'');
    }
}

