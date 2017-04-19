#include<stdio.h>
#include<string.h>
main()
{
    int i,j=0,temp=0;
    char ch1[50],ch2[50];
    printf("Enter a string ::");
    scanf("%s",ch1);
    printf("Enter a substring ::");
    scanf("%s",ch2);
    for(i=0;ch1[i]!='\0';i++)
    {
        if(ch1[i]==ch2[j])
        {
           temp=j++;
        }
        else
        {
            j=0;
        }
    }
    if(temp+1==strlen(ch2))
    {
        printf("Input string is a substring of another input string");
    }
    else
    {
        printf("Input string is  not a substring of another input string");
    }
    return 0;
}
