class MyThreadRunnable implements Runnable {  
    public void run() {  
      System.out.println(``thread is running...'');  
    }  
    public static void main(String args[]) {  
     MyThreadRunnable myObject = new MyThreadRunnable();  
     Thread thread = new Thread(myObject);  
     thread.start();  
    }  
}  
