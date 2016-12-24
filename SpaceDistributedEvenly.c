#include<stdio.h>
main()
{
    int i;
    char ch[100];
    printf("Enter a line::");
    scanf("%[^\n]%*c",ch);
    for(i=0;i<=strlen(ch);i++)
    {
        if(ch[i]==' ' && ch[i+1]==' ')
            ch[i]=ch[i+1];
        else
            printf("%c",ch[i]);
    }


}
