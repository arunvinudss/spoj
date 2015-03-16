import java.util.Scanner;
class fashion
{
public static int[] count(int a[])
{
int i=0,N=a.length;;
int buc[]=new int[11];
int ans[]=new int[N];
for(i=0;i<N;i++)
buc[a[i]]=buc[a[i]]+1;
for(i=1;i<=10;i++)
buc[i]=buc[i]+buc[i-1];
for(i=N-1;i>=0;i--)
ans[--buc[a[i]]]=a[i];
return ans;
}
public static void main(String args[]) throws Exception
{
int m=0,sum=0,j=0,N=0,i=0,k=0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
int res[]=new int [N];
for(i=0;i<N;i++)
{
k=sc.nextInt();
int b[]=new int[k];
int g[]=new int[k];

for(j=0;j<k;j++)
{

    b[j]=sc.nextInt();

}
for(j=0;j<k;j++)
{

    g[j]=sc.nextInt();

}

if(k!=1)
{
b=count(b);
g=count(g);
for(m=0;m<k;m++)
{
sum+=b[m]*g[m];
}
}
else
sum=b[0]*g[0];
res[i]=sum;
sum=0;
}
for(i=0;i<N;i++)
{
System.out.println(res[i]);
}
}
}
         

