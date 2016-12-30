#include<stdio.h>
main()
{
    int i,j,initial;
    char ch[100],ch1[100];
    printf("Enter a string::");
    gets(ch);
    for(i=0;i<strlen(ch);i++)
    {
        if(ch[0]>='a' && ch[0]<='z')
        {
            ch[0]=ch[0]-32;
        }
        if(ch[i]==' ')
        {
           ch[i+1]=ch[i+1]-32;
        }
        strcpy(ch1,ch);
    }
    printf("CAMEL CASE\n");
    for(i=0;i<strlen(ch1);i++)
    {
        if(ch1[i]==' ')
        {
            i++;
        }
        printf("%c",ch1[i]);
    }
}
