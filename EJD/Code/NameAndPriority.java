class NameAndPriority extends Thread {  
    public void run() {  
      System.out.println(``running thread name is: ''+
                   Thread.currentThread().getName());  
      System.out.println(``running thread priority is:''+
                   Thread.currentThread().getPriority());
    }  
    public static void main(String args[])  {  
      TestPriority priorityOne = new TestPriority();  
      TestPriority priorityTwo = new TestPriority();  
      priorityOne.setPriority(Thread.MAX_PRIORITY);  
      priorityTwo.setPriority(Thread.MIN_PRIORITY);  
      priorityOne.setName(``User1''); // naming a thread
      priorityTwo.setName(``User2''); // naming a thread
      priorityOne.start();  
      priorityTwo.start();
    }  
}     
