#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct book_t { 
    char title[25];
    char author[40];
    float price;
    int pages;
};

void display(struct book_t);
void writenewlist(struct book_t, FILE*); 
 
int main(int argc, char* argv[]) {
    if (argc != 2) {
        printf("Usage: %s Booklist\n", argv[0]);
        exit(0);
    }
  
    FILE* inp = fopen(argv[1], "r");
    FILE* out = fopen("BookList.new", "w");
    struct book_t aBook;

    char line[1024];
    while (fgets(line, 1024, inp) != NULL) {
        char buffer[40];
        char* p = line;
        char* q = buffer;

        // -------------------- *
        // Copy title to buffer *
        // -------------------- *
        while (*p != ',') {
            *q = *p;
            q++;
            p++;
        }
        *q = '\0'; //Terminate the title string
        strcpy(aBook.title, buffer);
        p++; // skip the comma

        // --------------------- *
        // Copy author to buffer *
        // --------------------- *
        q = buffer;
        while (*p != '\n') {
            *q = *p;
            q++;
            p++;
        }
        *q = '\0'; //Terminate the author name
        strcpy(aBook.author, buffer);

        printf("Enter price of %s by %s: ",
           aBook.title, aBook.author);
        scanf("%f", &aBook.price);
        printf("How many pages does it have? ");
        scanf("%d", &aBook.pages);

        display(aBook);
        writenewlist(aBook, out);
    }
    return 0;
}

void display(struct book_t book) {
    printf("Book details\n");
    printf("%s by %s is %d pages long and costs %7.2f\n",
         book.title, book.author, book.pages, book.price);
    return;
}

void writenewlist(struct book_t book, FILE* f) {
    fprintf(f, "%s,%s,%7.2f,%4d\n", book.title,
          book.author, book.price, book.pages);
    return;
}
