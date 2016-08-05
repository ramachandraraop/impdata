public class PrintmainThread {
    public static void main(String args[]) {
        System.out.println(``Let us find the current thread'');
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(``It's name: '' + t.getName());
    }
}

