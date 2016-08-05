#include <stdio.h>
int main(){
    char message[5] = { 'H', 'e', 'l', 'p', 0 };
    int  prime10[] = { 2, 3, 5, 7};
    for(int i = 0; i < 4; ++i) {
        printf("Address of message[%d] is = %x  ", i, &message[i]);
        printf("prime10[%d] is = %x\n", i, &prime10[i]); 
    }
    return 0;
}
