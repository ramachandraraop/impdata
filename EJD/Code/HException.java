class HException {
    public static void main(String args[]) {
        System.out.println(``Welcome'');
        try {
	    int num = args.length;
	    System.out.println(``No of args are :''+ num);
	    int result = 45 / num;
	    System.out.println(``The result is :'' + result);
	}
	catch(ArithmeticException ae) 
	    System.out.println(``cannot divide a number by zero'');
	}
	finally {
	    System.out.println(``Bye'');
	}
    }
}


