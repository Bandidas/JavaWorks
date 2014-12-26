package hafta04;

import java.util.Scanner;

class HaftaninGunleri
{
	byte gun;
	
	public void doKullaniciGirisi()
	{
		System.out.println("1. Pazartesi\n2. Sali\n3. Çarsamba");
		System.out.println("4. Persembe\n5. Cuma");
		System.out.println("6. Cumartesi\n7. Pazar");
		System.out.println("Gunu Giriniz: ");
		Scanner input =new Scanner(System.in);
		gun=input.nextByte();
	}
	
	public void doYazdir()
	{
		switch(gun)
		{
		case 1: 
			System.out.println("Pazartesi"); break;
		case 2:
			System.out.println("Sali"); break;
		case 3:
			System.out.println("Carsamba"); break;
		case 4:
			System.out.println("Persembe"); break;
		case 5:
			System.out.println("Cuma"); break;
		case 6:
			System.out.println("Cumartesi"); break;
		case 7:
			System.out.println("Pazar"); break;
		default:
			System.out.println("Gecersiz"); 
			doKullaniciGirisi();//Kullanýcý geçersiz bir giriþ yaptýðýnda döngünün
			doYazdir();//en baþtan döndürülmesini saðlar.
			break;
		}
	}
		
}

public class Ornek01_KontrolIfadeleri 
{

	public static void main(String[] args) 
	{
		HaftaninGunleri gunler1=new HaftaninGunleri();
		gunler1.doKullaniciGirisi();
		gunler1.doYazdir();
	}

}
