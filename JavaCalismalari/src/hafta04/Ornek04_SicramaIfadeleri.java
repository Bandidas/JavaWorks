package hafta04;

public class Ornek04_SicramaIfadeleri 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<2;i++)
		{
			System.out.print(i+":");
			for(int j=0;j<10;j++)
			{
				if(j==5) break;
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
