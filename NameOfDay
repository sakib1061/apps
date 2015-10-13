#include <stdio.h>
#include <math.h>
int lip(int year)
{
    if(year%100==0)
    {
        if(year%400==0)
            return 1;
        else
            return 0;
    }
    else {
        if(year%4==0)
            return 1;
        else
            return 0;
    }
}
int days(int day,int month,int year)
{
    int pd,sd,A[12]={0,31,59,90,120,151,181,212,243,273,304,334};
    pd=A[month-1];
    sd=pd+day;
    if(year==1 && month>2)
    {
        if(month==2 && day==29)
            sd+=1;
        if(month>2)
        sd+=1;
    }
    return sd;

}
int main()
{
    printf("\t\tDeveloped By Sakib\t\t\n");
    int day,month,year,test,k,d;
    char A[7][10]={"Sat","Sun","Mon","Tues","Wed","Thus","Fri"};
    while(1) {
        scanf("%d %d %d",&day,&month,&year);
        test=lip(year);
        d=days(day,month,test);
        k=(year-1)+floor((year-1)/4)+d;
        k=k%7;
        printf("%s Day\n",A[k]);
    }
}
