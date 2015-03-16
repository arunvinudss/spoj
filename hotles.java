import java.io.*;
import java.util.*;
class hotels
{
public static void main(String args[]) throws Exception
{
int i=0,j=0;
long sum=0,max=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
long m=Long.parseLong(st.nextToken());
long x[]=new long[n];
st=new StringTokenizer(br.readLine());
for(i=0;i<n;i++)
x[i]=Long.parseLong(st.nextToken());
for(i=0;i<x.length;i++)
{
sum+=x[i];
while(sum>m)
{
sum=sum-x[j];
j++;
}
if(sum<=m && max<sum)
{
max=sum;
}
if(max==m)
break;
}
System.out.println(max);

}}


