/****************************************\
   Allah is Almighty
   Coder-Boxtroll
   sakibhossain.nstu@gmail.com
/*****************************************/
#include <bits/stdc++.h>
using namespace std;
#define ff first
#define ss second
#define pai(A) pair<int,int>A
#define mkp(x,y) make_pair(x,y)
#define ll long long int
#define ull unsigned long long int
#define re(x) return x
#define rep(i,j) for(int i=0;i<j;i++)
#define per(i,j) for(int i=j;i>=0;i--)
#define po(i,j) pow(i+0.0,j)
#define pb(x) push_back(x)
#define ppb(x,y) push_back(pair<int, int>(x,y))
#define pf printf
#define sf scanf
#define all(x) x.begin(), x.end()
#define clr(x) x.erase(all(x))
#define sum(x) accumulate(all(x),0)
#define vi(x) vector<int>x
#define vs(x) vector<string>x
#define vp(x) vector< pair<int,int> >x
#define ca(x) pf("Case %d: ",x)
#define ne pf("\n")
#define SET(x) memset(x, 0, sizeof(x))
#define CLR(x) memset(x, -1, sizeof(x))
#define FAST ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
template <class T> T Max(T a, T b) { return a>b?a:b;}
template <class T> T Min(T a, T b) { return a<b?a:b;}
bool stb(const string &a,const string &b) ///sorting from small to big size///
{
    return a.size()<b.size();
}
bool bts(const string &a,const string &b)  ///sorting from big to small size///
{
    return a.size()>b.size();
}
bool pas(const pair< int,int > &a,const pair <int,int> &b) ///Sort by Second elements of Pair ///
{
    return a.ss<b.ss;
}

///Main Code Starting From Here///
int main()
{
    unsigned long long a,b,c,p;
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        cin>>a;
        b=a;
        a*=2;
//        cin>>a;
        a=sqrt(a+0.0);
        p=a;

        for(long long int j=a;j<(2*a);j++)
        {
            c=(j*(j+1));
//            cout<<c<<endl;
            c/=2;
            if(c>b) {
                    p=j-1;
                break;
            }
            else if(c==b)
            {
                break;
            }
        }
        c=(p*(p+1));
        c/=2;
//        cout<<c<<endl;
//        cout<<c<<endl;
        cout<<p<<endl;
        cout<<b-c<<endl;
//999999998765257141
    }
}
///Never Give Up///

