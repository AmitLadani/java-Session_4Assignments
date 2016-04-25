import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[6];
		for (int i=0;i<a.length;i++){
		
			Scanner aa = new Scanner(System.in); 
			System.out.print("Enter a Number: ");
			a[i] = aa.nextInt();
		
			if(i>0)
			{
				for (int x=i; x>0;x--)
			{	
			
					if (a[x]<a[x-1])
						{
							int j =a[x-1];
							a[x-1]=a[x];
							a[x]= j;
						}
			}

			}
		
			}
			for (int k=0; k<a.length;k++)
			{
				System.out.print(a[k] +", ");
		
			}
		
}
}