#include <iostream>
#include<string.h>
#include<stdio.h>
using namespace std;

int main()
{
    int n,len=0,i;
    char str[10];
    cout<<"Enter String";
    cin>>str;
    
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i] == 'a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u')
        len++;
    }
    cout<<"Length is"<<len;
    return 0;
}