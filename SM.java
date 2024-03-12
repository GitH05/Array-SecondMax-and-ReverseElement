import java.util.Scanner;
// findig the second max elements from the given array:
public class SM
{
public static void main(String[] args)
{
int i,size,SecondMax;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of teh array:");
size=s.nextInt();
int a[] =new int[size];

for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println("The elements  of the array are:");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}
SecondMax=a[0];
int max=a[0];
for(i=0;i<size;i++)
{
if(a[i]>max)
{
SecondMax=max;
max=a[i];
}
else if(a[i] >SecondMax && a[i]!=max)
{
SecondMax=a[i];
System.out.println(SecondMax);
}
}
System.out.println("\nThe max element is :"+max);
System.out.println("The second highest element is:"+SecondMax);

}
}