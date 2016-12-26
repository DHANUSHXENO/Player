#include<stdio.h>
#include"string.h"
void main()
{
    int i=0,j;
    char ch[10];
    printf("Enter a string ::");
    scanf("%s",ch);
    strrev(ch);
    printf("%s \n",ch);
    while(i<strlen(ch))
    {
        if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            printf("");
        else
            printf("%c",ch[i]);
        ++i;
    }
}
