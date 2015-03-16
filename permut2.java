import java.io.*;
import java.util.*;
class permut2
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s="";
while(true)
{
boolean fl=false;
int n=Integer.parseInt(br.readLine());
if(n!=0)
{
int x1[]=new int[n];
StringTokenizer st=new StringTokenizer(br.readLine());
Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
int t=Integer.parseInt(st.nextToken());
m1.put(t,i+1);
x1[i]=t;
}
for(int i=0;i<n;i++)
{
if(x1[i]!=m1.get(i+1)){
fl=true;
break;}
}
if(fl)
System.out.println("not ambiguous");
else
System.out.println("ambiguous");
}
else break;
}
}
}
