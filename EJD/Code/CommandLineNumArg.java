public class  CommandLineNumArg {
    public static void main(String[] args) {
        int firstArg, secondArg;
        if (args.length==2) {
            System.out.println(``before conversion:'');
            System.out.println(args[0] + args[1]);
            firstArg = Integer.parseInt(args[0]);
            secondArg = Integer.parseInt(args[1]);
            System.out.println(``after conversion:'');
            System.out.println(firstArg + secondArg);
        } else {
            System.out.println(``Two values must be required'');
        }
    }
}
