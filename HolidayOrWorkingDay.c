#include<stdio.h>
#include<string.h>
void main()
{
    char day[10];
    printf("Enter a day ::");
    scanf("%s",&day);
    if(strcmp(day,"Sunday")==0)
        printf("true");
    else if(strcmp(day,"Monday")==0||strcmp(day,"Tuesday")==0||strcmp(day,"Wednesday")==0||strcmp(day,"Thursday")==0||strcmp(day,"Friday")==0||strcmp(day,"Saturday")==0)
        printf("false");
    else
        printf("Invalid Input");
}
