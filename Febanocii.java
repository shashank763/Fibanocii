import java.util.Scanner;
public class Febanocii {
	public static void main(String[] args)
	{
		int i,n,t1=1,t2=1,nextterm;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		n =s.nextInt();
		for(i=1;i<=n;i++)
		{
			nextterm =t1+t2;
			t1=t2;
			t2=nextterm;
			System.out.println(+t1);
			
		}
	}

}
