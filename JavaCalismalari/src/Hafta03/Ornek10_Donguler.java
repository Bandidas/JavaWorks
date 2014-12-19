package Hafta03;

class IkiDongu
{
	public void doBaslat()
	{
		for(int i=0,j=10;i<10&&j>0;i++,j--)
		{
			System.out.println("i: "+i);
			System.out.println("j: "+j);
		}
	}
}

public class Ornek10_Donguler
{
	public static void main(String[] args) 
	{
		IkiDongu dongu1=new IkiDongu();
		dongu1.doBaslat();
	}

}
