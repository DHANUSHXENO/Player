#include"stdio.h"
main()
{
    char ch[50];int i,j,flag=0;
    gets(ch);
    for(i=0;i<strlen(ch);i++)
    {
        for(j=0;j<strlen(ch);j++)
        {
            if(ch[i]==ch[j] && i!=j)
            {
                flag=1;
            }
        }
        if(flag==1)
            printf("%c",ch[i]-32);
        else
            printf("%c",ch[i]);
        flag=0;
    }
}
