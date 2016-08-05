public class Prime {
    public static void main(String str[]) {
        int num = 5;
        boolean flag = true;
        for (int i = 2; i <= num / 2; i++) {
            if(num % i != 0)
                continue;
            flag = false;
            System.out.println(``Not Prime'');
            break;
        }
        if (flag)
            System.out.println(``Prime'');
    }
}

