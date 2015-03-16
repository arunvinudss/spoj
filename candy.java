import java.io.*;
import java.util.*;
class candy
{
public static void main(String args[]) throws Exception
{
int i=0,n=0,m=0,s=0,ans=0;
int[] x;
ArrayList<Integer> ans1=new ArrayList<Integer>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while((n=Integer.parseInt(br.readLine()))!=-1)
{
x=new int[n];
for(i=0;i<n;i++)
x[i]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
s=s+x[i];
m=s%n;
if(m==0)
{
m=s/n;
for(i=0;i<n;i++)
{

if(x[i]>m)
ans=ans+(x[i]-m);

}
ans1.add(ans);

}
else
ans1.add(-1);
s=0;
ans=0;


}
for(int j:ans1)
System.out.println(j);
}
}

