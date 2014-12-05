package Java;

class KareAl
{
	int sayi;
	public void setSayi(int sayi)
	{
		this.sayi=sayi;
	}
	public int getSayi()
	{
		return sayi;
	}
	public int doHesapla()
	{
		return sayi*sayi;
	}
	public void doYazdir()
	{
		System.out.println("girilen: "+getSayi());
		System.out.println("Karesi: "+sayi);
	}
}

public class ornek07 {

	public static void main(String[] args) 
	{
		KareAl kare=new KareAl();
		kare.setSayi(8);
		kare.doYazdir();
	}

}
