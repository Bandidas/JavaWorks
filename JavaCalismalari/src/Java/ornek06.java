package Java;

class DortIslem5
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
}

public class ornek06 
{
	public static void main(String[] args)
	{
		DortIslem5 dortIslem1=new DortIslem5();
		dortIslem1.setSayi(8);
		System.out.println("girdiðiniz rakam"+dortIslem1.getSayi());
	}
}
