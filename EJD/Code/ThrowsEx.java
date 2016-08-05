import java.io.*;
class ThrowsEx {
    static void accept() throws IOException {
	BufferedReader br = new BufferedReader
            (new InputStreamReader(System.in));
	System.out.println(``Enter your Name'');
	String name = br.readLine();
	System.out.println(``Hello''+''  ''+name);
    }
    public static void main(String args[]) throws IOException {
        accept();
    }
}
