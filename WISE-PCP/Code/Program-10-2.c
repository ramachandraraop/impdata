 #include <stdio.h>
 int main() {
     int matrix[3][3];
     int sum_diag = 0;

     printf("Enter 9 integer elements: \n");
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             scanf("%d", &matrix[i][j]);
         }
     }
     
     printf("given matrix is: \n");
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             printf("%3d\t", matrix[i][j]);
         }
         printf("\n");
     }
     
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             if (i == j)
                 sum_diag += matrix[i][j];
         }
     }
     printf("Diagonal sum of given matrix is: %d\n" ,sum_diag);
     return 0;
}
