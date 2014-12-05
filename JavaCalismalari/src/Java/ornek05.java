package Java;

class DortIslem4
{
	int sayi1;
	int sayi2;
	public void setSayi(int sayi1,int sayi2)
	{
		this.sayi1=sayi1;
		this.sayi2=sayi2;
	}
	public void doYazdir()
	{
		System.out.println("1.sayi: "+sayi1);
		System.out.println("2.sayi: "+sayi2);
	}
}

public class ornek05 
{
	public static void main(String[] args)
	{
		DortIslem4 dortIslem1=new DortIslem4();
		dortIslem1.setSayi(8, 9);
		dortIslem1.doYazdir();
	}
}
