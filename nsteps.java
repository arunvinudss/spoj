import java.util.Scanner;
class nsteps
{
public static void plo(int x,int y)
{
if(x==y)
{
if(x%2==0)
System.out.println(2*y);
else
System.out.println(2*y-1);
}
else
if(x>y)
{
if(x-y==2)
{
if(x%2==0 && y%2==0)
System.out.println(x+y);
else
if(x%2!=0 && y%2!=0)
System.out.println(x+y-1);
else
System.out.println("No Number");
}
else
System.out.println("No Number");
}
else
System.out.println("No Number");
}
public static void main(String args[]) throws Exception
{
int i=0,N=0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
int x[]=new int[N];
int m[]=new int[N];
for(i=0;i<N;i++)
{
x[i]=sc.nextInt();
m[i]=sc.nextInt();
}
for(i=0;i<N;i++)
plo(x[i],m[i]);
}
}


