#include<stdio.h>
main()
{
    int x,flag=0,i;
    printf("Enter a number ::");
    scanf("%d",&x);
    for(i=2;i<x;i=i*2)
    {
        if(x%i!=0)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
        printf("The number is not a power of two");
    else
        printf("The number is power of two");

}

