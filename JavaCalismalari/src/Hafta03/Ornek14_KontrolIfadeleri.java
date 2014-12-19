package Hafta03;

class DonguVeKontrol
{
	public void tekCift()
	{
		for(int i=0;i<10;i++)
		{
			if(i%2==0&&i>0) System.out.println(i+" Sayisi Cift Sayidir.");
		}
	}
}

public class Ornek14_KontrolIfadeleri 
{
	public static void main(String[] args) 
	{
		DonguVeKontrol dongu1=new DonguVeKontrol();
		dongu1.tekCift();
	}

}
