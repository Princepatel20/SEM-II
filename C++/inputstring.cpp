#include <iostream>

using namespace std;
int main()
{
    int n,len=0,i;
    char str[10];
    char *str1;
    cout<<"Enter String";
    cin>>str;
    cout<<"String is"<<Str;
    
    
    printf("Enter String");
    scanf("%s",str);
    printf("Strig is %s",str);
    
    puts("Enter String");
    gets(str1);
    puts(str1);
    
    
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i] == 'a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u')
        len++;
    }
    cout<<"Length is"<<len;
    return 0;
}