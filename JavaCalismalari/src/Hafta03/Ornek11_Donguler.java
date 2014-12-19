package Hafta03;

class Sayilar
{
	int[] sayilar={8,11,4,16,6,20,14};
	public void doYazdir()
	{
		for(int i=0;i<sayilar.length;i++)
		{
			System.out.println(sayilar[i]);
		}
	}
}

public class Ornek11_Donguler 
{
	public static void main(String[] args) 
	{
		Sayilar sayilar1=new Sayilar();
		sayilar1.doYazdir();
	}

}
