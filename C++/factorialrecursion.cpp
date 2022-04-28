#include <iostream>

using namespace std;
int fact(int n)
{
    if(n>=1)
        return n*fact(n-1);
    else
        return 1;
}
int main()
{
    int n,ans;
    cout<<"Enter n";
    cin>>n;
    ans=fact(n);
    cout<<"Answer is"<<ans;
    return 0;
}
