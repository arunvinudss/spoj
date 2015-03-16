import java.io.*;
import java.util.*;
class absys
{
public static boolean checks(String s)
{
int i=0,t=0,n=0,flag=0;
while(n!=s.length())
{
if((s.charAt(n))=='m')
{
flag=1;
break;
}
n++;
}
if(flag==1)
return false;
else
return true;
}
public static void main(String args[]) throws Exception
{
int i=0,n=0,a=0,b=0,c=0;
StringTokenizer st=new StringTokenizer("");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
String x[]=new String[t];
String temp="";
for(i=0;i<t;i++)
{
br.readLine();
x[i]=br.readLine();
}
for(i=0;i<t;i++)
{
st=new StringTokenizer(x[i]);
temp=st.nextToken();
if(checks(temp))
a=Integer.parseInt(temp);
else
a=-777;
st.nextToken();
temp=st.nextToken();
if(checks(temp))
b=Integer.parseInt(temp);
else
b=-777;
st.nextToken();
temp=st.nextToken();
if(checks(temp))
c=Integer.parseInt(temp);
else
c=-777;
if(a!=-777 && b!=-777)
c=a+b;
else
if(a!=-777 && c!=-777)
b=c-a;
else
if(b!=-777 && c!=-777)
a=c-b;
System.out.println(a+" "+"+"+" "+b+" "+"="+" "+" "+c);
}
}
}






