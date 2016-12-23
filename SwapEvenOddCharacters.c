#include<stdio.h>
#include<string.h>
main()
{
    int i,j;
    char ch[10],a,b,temp=0;
    printf("Enter a string");
    scanf("%s",ch);
    for(i=0;i<strlen(ch);i++)
    {

        printf("%c%c",ch[i+1],ch[i]);
        i++;
    }

}
