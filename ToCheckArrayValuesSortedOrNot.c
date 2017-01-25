#include<stdio.h>
main()
{
    int i,n,a[100],ascending=0,descending=0;
    printf("Enter the range ::");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n-1;i++)
    {
        if(a[i]<a[i+1])
        {
            ++ascending;
        }
        if(a[i]>a[i+1])
        {
            ++descending;
        }
    }
    if((ascending == n-1) || (descending == n-1))
    {
        printf("Yes it is sorted");
    }
    else
    {
        printf("It is not sorted");
    }
}
