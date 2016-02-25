#include <bits/stdc++.h>
using namespace std;
/////Auther : Sakib@NSTU///////
int lip(int y)
{
    if(y%100==0)
    {
        if(y%400==0)
            return 1;
        else
            return 0;
    }
    else
    {
        if(y%4==0)
            return 1;
        else
            return 0;
    }
}
void d(int dd,int mm,int yy,int c)
{
    int r=lip(yy+594);
    char bang[12][10]={"Poush", "Magh", "Falgun", "Chaitra","Baishakh", "Jaishtha", "Ashar", "Sraban", "Bhadra", "Ashwin", "Kartik" ,"Agrahayan"};
int ff[12]={31,28+r,31,30,31,30,31,31,30,31,30,31};
int rr[12]={30,30,30+r,30,31,31,31,31,31,30,30,30};
    int de=18,me=1,i,j;
    for(i=1;i<=12;i++)
    {
        for(j=1;j<=ff[i-1];j++)
        {if(dd==j && mm==i)
                break;
            de++;
            if(de>rr[me-1])
            {
                de=1;
                me++;
                if(me>12)
                    me=1;
            }

        }
        if(dd==j && mm==i)
                break;
    }
if(dd==14 && mm==4 || dd>=14 && mm==4 || mm>4)
    yy++;
    cout<<"The Bangla Date is-\n"<<de<<", "<<bang[me-1]<<", "<<yy<<endl<<endl;
}
int main()
{
int test,i,j,k,dd,mm,yy,lp;
cout<<"Enter Your Desire Test Case\n";
cin>>test;
for(i=1;i<=test;i++)
{
cout<<"Enter The English Day(day/month/year):\n";
    cin>>dd>>mm>>yy;
    d(dd,mm,yy-594,i);
}
return 0;
}

