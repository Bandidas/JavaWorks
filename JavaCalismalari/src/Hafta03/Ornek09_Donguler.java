package Hafta03;

class IlkOnSayi
{
	public void doBaslat()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		for(;;)
		{
			System.out.println("sonsuz dongu");
		}
	}
}

public class Ornek09_Donguler 
{
	public static void main(String[] args) 
	{
		IlkOnSayi sayi1=new IlkOnSayi();
		sayi1.doBaslat();
	}

}
