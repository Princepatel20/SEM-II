/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    int result;
    char a[20]="Program";
    char b[20]={'P','r','o','g','r','a','m','\0'};
    char c[20];
    
    cout<<"Length of string a ="<<strlen(b);
    strcpy(c, a);
    cout<<"copy string is ="<<c;
    
    strcat(c, a);
    cout<<"concate string is ="<<c;
    
    result = strcmp(a, c);
    cout<<"Strcmp result"<<result;
    
    return 0;
}