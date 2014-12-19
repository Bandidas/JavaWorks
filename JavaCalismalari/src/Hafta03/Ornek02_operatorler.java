package Hafta03;

class LojikOperatorler
{
	int sayi;
	boolean sonuc;
	public int getSayi() 
	{
		return sayi;
	}
	public void setSayi(int sayi) 
	{
		this.sayi = sayi;
	}
	public void veOperatoru()
	{
		sonuc=sayi>0&&sayi<10;
	}
	public void veyaOperatoru()
	{
		sonuc=sayi>0||sayi==-5;
	}
	public void degilOperatoru()
	{
		sonuc=!(sayi>0&&sayi<10);
	}
	public void doYazdir()
	{
		System.out.println("sonuc: "+sonuc);
	}
}

public class Ornek02_operatorler 
{
	public static void main(String[] args)
	{
		LojikOperatorler lojik1=new LojikOperatorler();
		
		lojik1.setSayi(8);
		lojik1.veOperatoru();
		lojik1.doYazdir();
		
		lojik1.setSayi(-5);
		lojik1.veyaOperatoru();
		lojik1.doYazdir();
		
		lojik1.setSayi(-1);
		lojik1.veyaOperatoru();
		lojik1.doYazdir();
		
		lojik1.setSayi(8);
		lojik1.degilOperatoru();
		lojik1.doYazdir();
		
		lojik1.setSayi(11);
		lojik1.degilOperatoru();
		lojik1.doYazdir();
	}
}
