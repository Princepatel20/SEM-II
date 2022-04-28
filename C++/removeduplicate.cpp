#include <iostream>

using namespace std;

int main()
{
    char str[10],index=0,len=0,n;
    cout<<"Enetr String";
    cin>>str;
    
    for(int i=0;str[i]!='\0';i++)
    {
        len++;
    }
    n=len;
    for (int i=0; i<n; i++) 
    {
        
     int j;  
     for (j=0; j<i; j++) 
        if (str[i] == str[j])
           break;
       
  
     if (j == i)
        str[index++] = str[i];
   }
   str[index]='\0';
   cout<<"String is"<<str;

    return 0;
}
