#include<stdio.h>
int gcd(int a,int b)
{
   //Your code goes here
   if(a==b)
        return a;
    if(a>b)
        return gcd(a-b,b);
    else
        return gcd(a,b-a);
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    printf("%d ",gcd(a,b));
    return 0;
}
