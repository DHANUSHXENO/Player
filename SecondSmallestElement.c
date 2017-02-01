#include<stdio.h>
main()
{
    int num[50],n,i,j,temp;
    printf("Enter the number of elements ::");
    scanf("%d",&n);
    printf("Enter the elements : \n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&num[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
             if(num[i]<num[j])
             {
                 temp=num[i];
                 num[i]=num[j];
                 num[j]=temp;
             }

        }
    }
    printf("The second smallest element in the array is %d",num[1]);
}
