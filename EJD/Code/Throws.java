import java.io.*;       
class Throws {
    static void accept() {
	BufferedReader br = new BufferedReader
           (new InputStreamReader(System.in));
	System.out.println(``Enter your Name'');
	String name = br.readLine();
	System.out.println(``Hello''+''  ''+name);
    }
    public static void main(String args[]) {
        accept();
    }
}
