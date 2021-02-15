package mavenexample1;
import java.util.Scanner;
public class foursswap {
	private static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{
		int size;
	System.out.println("enter array size:");
	size=input.nextInt();
	int[] array=new int[size];
	System.out.println("enter elements:");
	for(int i=0;i<size;i++)
	{
		array[i]=input.nextInt();
	}
	array=arraySorted(array);
	}
	private static int[] arraySorted(int[] array) {
		int m=0,before=0,temp=0,flag=0,n=0,after=0;
		for(int i=0;i<array.length;i++)
		{
			m=i;
			n=i;
			if(array[i]==3)
			{
				//System.out.println("entered"+array[i]);
				before=m;
				before--;
				if(i!=0)
				{
				while(!(before==0))
				{
				if(array[before--]==4)
				{
					if(array[before]!=3)
					{
						
						temp=array[m+1];
						array[m+1]=array[before+1];
						array[before+1]=temp;
						
						flag=1;
						break;
					}
					else
					{
						before--;
					}
				}
				}
				}
				if(flag==0)
				{
					after=n;
					after++;
					if(i!=array.length-1)
					{
					while(!(after==array.length))
					{
						if(array[after]==4)
						{
							
							temp=array[n+1];
							array[n+1]=array[after];
							array[after]=temp;
							break;
						}
						else
						{
							after++;
						}
					}
					}
				}
			
		}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		return null;
	
	}
}
