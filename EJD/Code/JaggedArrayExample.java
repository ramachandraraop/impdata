class JaggedArray {
    public static void main(String args[]) {
        //jagged array that can contain two 1D arrays

        int x[][] = new int[2][];

        //create 2 more 1D arrays as part of x

        x[0] = new int[2]; //2 elements in first array
        x[1] = new int[3]; //3 elements in second array

        //store 2 elements into first array

        x[0][0] = 10;
	x[1][1] = 20;

	//store 3 elements into second array

	x[1][0] = 30;
	x[1][1] = 20;
	x[1][2] = 40;

	//display first array

	for (int i = 0; i < 2; i++) {
	    System.out.print(x[0][i] + `` '');
        }
        System.out.println();

	//display second array

	for (int i = 0; i < 3; i++) {
	    System.out.print(x[1][i] + `` '');
        }
        System.out.println();
    }
}
