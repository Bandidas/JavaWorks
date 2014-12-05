package Java;

class DortIslem3
{
	public void setSayi(int sayi)
	{
		System.out.printf("parametre olarak gelen sayý= %d",sayi);
	}
}

public class ornek04 
{
	public static void main(String[] args)
	{
		DortIslem3 islem=new DortIslem3();
		islem.setSayi(8);
	}
}
