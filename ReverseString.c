#include<string.h>
#include<stdio.h>
main()
{
    char a[10];
    printf("Enter a string ::");
    gets(a);
    printf("the reverse string is %s",strrev(a));
}
