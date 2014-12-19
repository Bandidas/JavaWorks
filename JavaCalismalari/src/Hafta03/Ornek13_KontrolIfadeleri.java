package Hafta03;

class HavaDurumu
{
	int sicaklik;

	public int getSicaklik() 
	{
		return sicaklik;
	}

	public void setSicaklik(int sicaklik) 
	{
		this.sicaklik = sicaklik;
	}
	public void doMesaj()
	{
		if(getSicaklik()>35) System.out.println("Cok dikkat edin!");
		else if(getSicaklik()<0) System.out.println("Cok soguk!");
		else System.out.println("Hava normal");
	}
}

public class Ornek13_KontrolIfadeleri 
{
	public static void main(String[] args) 
	{
		HavaDurumu hava=new HavaDurumu();
		
		hava.setSicaklik(36);
		hava.doMesaj();
		
		hava.setSicaklik(-1);
		hava.doMesaj();
		
		hava.setSicaklik(8);
		hava.doMesaj();
	}

}
