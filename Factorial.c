#include<stdio.h>
main()
{
    int a,fact=1;
    printf("Enter a number ::");
    scanf("%d",&a);
    while(a>0)
    {
        fact=fact*a;
        a--;
    }
    printf("%d",fact);
}
