package Hafta03;

class SoruIsaretiOperatoru
{
	int sayi;

	public int getSayi() 
	{
		return sayi;
	}

	public void setSayi(int sayi) 
	{
		this.sayi = sayi;
	}
	public String ifThenElse()
	{
		return sayi>0?"B�y�k":"K���k";
	}
	public void doYazdir()
	{
		System.out.println(ifThenElse());
	}
}

public class Ornek03_Operatorler 
{

	public static void main(String[] args) 
	{
		SoruIsaretiOperatoru soru1=new SoruIsaretiOperatoru();
		soru1.setSayi(8);
		soru1.doYazdir();
	}

}
