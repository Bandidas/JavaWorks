package Hafta03;

class Sifre
{
	public void doGiris()
	{
		int denemeSayisi=1;
		do
		{
			System.out.println(denemeSayisi+". deneme");
			denemeSayisi++;
		}while(denemeSayisi<=4);
	}
}

public class Ornek07_Donguler 
{
	public static void main(String[] args) 
	{
		Sifre sifre1=new Sifre();
		sifre1.doGiris();
	}

}
