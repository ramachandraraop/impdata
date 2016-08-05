#include <stdio.h>
#include <string.h>

char* getString(char* string, int size);

int main() {
  char name[41];
  printf("Enter name: ");
  getString(name, 40);
  printf("<%s>\n", name);
  return 0;
}

char* getString(char* s, int n) {
  fgets(s, n, stdin);
  int linefeedPosition = strlen(s) - 1;
  s[linefeedPosition] = '\0';
  return s;
}
