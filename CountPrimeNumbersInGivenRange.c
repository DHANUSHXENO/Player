#include"stdio.h"
main()
{
    int a,b,i,j,flag=0,count=0;
    printf("Enter the range :: \n");
    scanf("%d\n%d",&a,&b);
    for(i=a;i<=b;++i)
    {
        for(j=2;j<=i/2;++j)
        {
            if(i%j==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            count++;
        flag=0;
    }
    printf("The number of prime numbers int he given range %d to %d is :: %d",a,b,count);
}

