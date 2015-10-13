#include <bits/stdc++.h>
using namespace std;
#define sym 'X'
#define point '!'
#define size 15
char A[size][size],B[size][size],C[size][size],D[size][size],Y[size],X[size],X1[size],Y1[size],center='o';
void update (int x,int y)
{
    if(x==0 && y==0)
        center=point;
else if(x==0 && y!=0 )
    {
       if(y>0)
            Y[size-y]=point;
        else
            Y1[abs(y+1)]=point;
    }
    else if(y==0 && x!=0)
    {
       if(x>0)
            X[x-1]=point;
        else
            X1[size+x]=point;
    }
    else if(x!=0 && y!=0){
        if(x>0 && y>0)
            B[size-y][x-1]=point;
        else if( x>0 && y<0)
              D[-y-1][x-1]=point;
        else if(x<0 && y<0)
            C[-y-1][size+x]=point;
        else if(x<0 && y>0)
            A[size-y][size+x]=point;
    }
}
void value()
{
    int i,j;
        for(i=0;i<size;i++)
        for(j=0;j<size;j++)
        A[i][j]='-';
    for(i=0;i<size;i++)
    for(j=0;j<size;j++)
        B[i][j]='-';
        for(i=0;i<size;i++)
        for(j=0;j<size;j++)
        C[i][j]='-';
    for(i=0;i<size;i++)
    for(j=0;j<size;j++)
        D[i][j]='-';
            for(i=0;i<size;i++)
        Y[i]=sym;
    for(i=0;i<size;i++)
        X[i]=sym;
        for(i=0;i<size;i++)
        X1[i]=sym;
    for(i=0;i<size;i++)
        Y1[i]=sym;
}
void print()
{
    int i,j;
           for(i=0;i<(size*2)+1;i++) {
            if(i<size) {
                for(j=0;j<size;j++)
            printf("%c",A[i][j]);
            printf("%c",Y[i]);
            for(j=0;j<size;j++)
                printf("%c",B[i][j]);
            }

else if(i==size)
{
    for(j=0;j<size;j++)
        printf("%c",X1[j]);
    printf("%c",center);
    for(j=0;j<size;j++)
        printf("%c",X[j]);
}
else if(i>size) {
            for(j=0;j<size;j++)
            printf("%c",C[i-(size+1)][j]);
            printf("%c",Y1[i-(size+1)]);
            for(j=0;j<size;j++)
            printf("%c",D[i-(size+1)][j]);
}
                        printf("\n");
}
}
int main()
{
    int i,j,k,x,y;
    while(1) {
    scanf("%d %d",&x,&y);
    value();
    update(x,y);
    print();
    }
    }
