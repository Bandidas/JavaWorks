package Hafta03;

class Meyveler
{
	public void doYazdir()
	{
		int[] sayilar={11,4,16,6,20,14,8,6};
		String[] meyveler={"Elma","Ananas","Kiraz","Armut"};
		for(String meyve:meyveler)
		{
			System.out.println(meyve);
		}
		for(int sayi:sayilar)
		{
			System.out.println(sayi);
		}
	}
}

public class Ornek12_Donguler 
{
	public static void main(String[] args) 
	{
		Meyveler meyve1=new Meyveler();
		meyve1.doYazdir();
	}

}
