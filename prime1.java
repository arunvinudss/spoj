import java.io.*;
import java.util.*;
class prime1
{
public static void genprime(int n1[],int n2[])
{
int a=0,b=0,i=0,j=0;
int t=0;
        BitSet pr=new BitSet(31623);
for(i=2;i<31623;i++)
pr.set(i);
for(i=3;i*i<=31622;i=i+2)
{
j=i;
t=i*j;
if(pr.get(i))
{
while(t<=31622)
{
pr.clear(t);
j++;
t=i*j;
}
}
}
for(int m1=0;m1<n1.length;m1++)
{
a=n1[m1];
b=n2[m1];
if(a==1)
a=2;
BitSet sp=new BitSet(b-a+1);
for(i=0;i<(b-a+1);i++)
sp.set(i);
for(i=2;i*i<=b;i++)
{
if(pr.get(i))
{
t=a/i;
t=t*i;
if(t==0)
  t=i*2;
if(t==i)
t=t+i;
if(t<a)
t=t+i;
while(t<=b)
{
sp.clear(t-a);
t=t+i;
}
}
}
System.out.println();
for(i=0;i<(b-a+1);i++)
{
if(sp.get(i))
System.out.println(a+i);
}
}
}
public static void main(String args[]) throws Exception
{
   int t=0;
   StringTokenizer s1=new StringTokenizer("");
   String in="";
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   t=Integer.parseInt(br.readLine());
   int n1[]=new int[t];
   int n2[]=new int[t];
  for(int i=0;i<t;i++)
    {
         in=br.readLine();
         s1=new StringTokenizer(in);
          n1[i]=Integer.parseInt(s1.nextToken());
         n2[i]=Integer.parseInt(s1.nextToken());
    }
   genprime(n1,n2);
}
}
 





