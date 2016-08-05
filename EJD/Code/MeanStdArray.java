// Find the mean and standard deviation of numbers kept in an array
public class MeanStdArray {
   public static void main(String[] args) {
      int[] marks = {74, 43, 58, 60, 90, 64, 70};
      int sum = 0;
      int sumSq = 0;
      int count = marks.length;
      double mean, stdDev;
      for (int i = 0; i < count; ++i) {
         sum += marks[i];
         sumSq += marks[i] * marks[i];
      }
      mean = (double)sum/count;
      System.out.printf(``Mean is %.2f%n'', mean);
      stdDev = Math.sqrt((double)sumSq/count - mean*mean);
      System.out.printf(``Std dev is %.2f%n'', stdDev);
   }
}
