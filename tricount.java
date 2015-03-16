import java.io.*;
class tricount{
public static void main(String args[]) throws Exception{
int i=0,T=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
T=Integer.parseInt(br.readLine());
long x[]=new long[T];
for(i=0;i<T;i++)
x[i]=Long.parseLong(br.readLine());
for(i=0;i<T;i++)
{
	long m=x[i];
	System.out.println((m*(m+2)*(m*2+1))/8);
}

}}

