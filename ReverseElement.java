import java.util.Scanner;
public class ReverseElement
{
public static void main(String[] args)
{
int i,j,size;
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of the array:");
size=s.nextInt();
System.out.println("The size of the array is:"+size);
int a[]=new int[size];
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

System.out.println("The reverse elements are:");
for(j=size-1;j<i;j--)
{
System.out.print(a[j]+" ");
}


}
}