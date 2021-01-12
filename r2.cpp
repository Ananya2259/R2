#include <iostream>
using namespace std;
int main()
{
  int R1,s;
  int R2;
  cin>>R1;
  cin>>s;
  if(R1<1000 && s<1000)
  {
      R2=s*2-R1;
      cout<<R2;
  }
}