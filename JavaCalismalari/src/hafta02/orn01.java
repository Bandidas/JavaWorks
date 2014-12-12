package hafta02;

import java.util.Scanner;

class dortislem
{
	int sonuc;
	public int topla(int s1,int s2)
	{
		sonuc=s1+s2;
		return sonuc;
	}
	public int cikar(int s1,int s2)
	{
		sonuc=s1-s2;
		return sonuc;
	}
	public int carp(int s1,int s2)
	{
		sonuc=s1*s2;
		return sonuc;
	}
	public int bol(int s1,int s2)
	{
		sonuc=s1/s2;
		return sonuc;
	}
	public void getSonuc()
	{
		System.out.println("Isleminizin sonucu:"+sonuc);
	}
}

public class orn01 
{

	public static void main(String[] args) 
	{
		dortislem dIslem=new dortislem();
		System.out.println("1. sayiyi giriniz: ");
		Scanner input =new Scanner(System.in);
		int girilen1=input.nextInt();
		System.out.println("2. sayiyi giriniz: ");
		Scanner input1 =new Scanner(System.in);
		int girilen2=input1.nextInt();
		System.out.println("Toplama icin = 1 \n Cikarma icin = 2 \n carpma icin = 3 \n bolme icin = 4");
		Scanner input2=new Scanner(System.in);
		int islem=input2.nextInt();
		if(islem==1)
		{
			dIslem.topla(girilen1, girilen2);
			dIslem.getSonuc();
		}
		else if(islem==2)
		{
			dIslem.cikar(girilen1, girilen2);
			dIslem.getSonuc();
		}
		else if(islem==3)
		{
			dIslem.carp(girilen1, girilen2);
			dIslem.getSonuc();
		}
		else if(islem==4)
		{
			dIslem.bol(girilen1, girilen2);
			dIslem.getSonuc();
		}
		else System.out.println("gecerli bir islem giriniz.");
		
	}

}
