import java.io.*;
import java.util.*;
class sbets
{
public static void main(String args[]) throws Exception
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int c=Integer.parseInt(br.readLine());
for(int i=0;i<c;i++)
{
Map<String,Integer> m1=new HashMap<String,Integer>(16);

int max=0;
String win="";
for(int j=0;j<16;j++)
{
StringTokenizer st=new StringTokenizer(br.readLine());
String s1=st.nextToken();
String s2=st.nextToken();
int t1=Integer.parseInt(st.nextToken());
int t2=Integer.parseInt(st.nextToken());
if(t1>t2)
{
if(m1.get(s1)!=null)
m1.put(s1,(m1.get(s1)+1));
else
m1.put(s1,1);
}
else
{
if(m1.get(s2)!=null)
m1.put(s2,(m1.get(s2)+1));
else
m1.put(s2,1);
}
}

for(Map.Entry<String,Integer> ent:m1.entrySet())
{
if(ent.getValue()>max)
{
max=ent.getValue();
win=ent.getKey();
}
}
System.out.println(win);
}


}


}

