import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class pt1
{
public static int[] genprime()
{
int a=2,b=10000,i=0,j=0;
int t=0;
boolean pr[]=new boolean[101];
for(i=2;i<101;i++)
pr[i]=true;
for(i=2;i*i<=101;i++)
{
j=i;
t=i*j;
if(pr[i])
{
while(t<=101)
{
pr[(int) t]=false;
j++;
t=i*j;
}
}
}
if(a==1)
a=2;
boolean sp[]=new boolean[b-a+1];
for(i=0;i<sp.length;i++)
{
sp[i]=true;
}
for(i=2;i*i<=b;i++)
{
if(pr[i])
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
sp[t-a]=false;
t=t+i;
}
}
}
j=0;
int pri[]=new int[1229];
for(i=0;i<sp.length;i++)
{
if(sp[i])
{
pri[j]=a+i;
j++;
}
}
return pri;
}


public static void factzz(int n)
{
int[] pr=genprime();
int i=0,j=0,c=0,k=0;
ArrayList<Integer> and1=new ArrayList<Integer>();
for(i=0;i<pr.length;i++)
{
j=pr[i];
if(pr[i]>n)
break;
while((n/j)!=0)
{
c=c+(n/j);
j=j*pr[i];
}
and1.add(k,c);
k++;
c=0;
}
for(i=0;i<and1.size();i++)
{
System.out.print(pr[i]+"^"+and1.get(i));
if((i+1)!=and1.size())
System.out.print(" * ");
}
}
public static void main(String args[]) throws Exception
{
int N=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
N=Integer.parseInt(br.readLine());
factzz(N);
}
}

