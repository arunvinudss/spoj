import java.io.*;
class danger
{
public static int near2(int x)
{
return 2*(x-(int) Math.pow(2,Math.floor(Math.log10(x)/0.3010299)))+1;
}
public static void main(String args[]) throws Exception
{
int n=0;
StringBuilder sb=new StringBuilder();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String x="";
while(!(x=br.readLine()).equals("00e0"))
{
n=0;
sb.append(x.charAt(n));
n++;
sb.append(x.charAt(n));
n=n+2;
n=Character.getNumericValue(x.charAt(n));
while(n!=0)
{
sb.append("0");
n--;
}
System.out.println(near2(Integer.parseInt(sb.toString())));
sb=new StringBuilder();
}
}
}



