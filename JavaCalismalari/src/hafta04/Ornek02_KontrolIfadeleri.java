package hafta04;

import java.util.Scanner;

class Mevsimler
{
	byte ay;
	public void doKullaniciGirisi()
	{
		System.out.println("1. Ocak\n2. Subat\n3. Mart\n4. Nisan\n5. Mayis");
		System.out.println("6. Haziran\n7. Temmuz\n8. Agustos\n9.Eylul");
		System.out.println("10.Ekim\n11. Kasim\n12. Aralik");
		Scanner input=new Scanner(System.in);
		ay=input.nextByte();
	}
	public void doYazdir()
	{
		switch(ay)
		{
		case 12:
		case 1:
		case 2:
			System.out.println("kis"); break;
		case 3:
		case 4:
		case 5:
			System.out.println("Ýlkbahar"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("Yaz");break;
		case 9:
		case 10:
		case 11:
			System.out.println("Sonbahar");break;
		default:
			System.out.println("Gecersiz"); break;
		}
	}
}

public class Ornek02_KontrolIfadeleri 
{
	public static void main(String[] args) 
	{
		Mevsimler mevsim=new Mevsimler();
		mevsim.doKullaniciGirisi();
		mevsim.doYazdir();
	}

}
