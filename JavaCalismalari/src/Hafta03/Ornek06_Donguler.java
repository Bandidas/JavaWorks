package Hafta03;

class Ogrenci
{
	public void doSay(int sayi)
	{
		while(sayi>0)
		{
			System.out.println(sayi--);
		}
	}
}

public class Ornek06_Donguler
{
	public static void main(String[] args)
	{
		Ogrenci ogrenci=new Ogrenci();
		ogrenci.doSay(8);
	}
}
