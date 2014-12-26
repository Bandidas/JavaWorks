package hafta04;

class Aylar2
{
	String[] aylar={"Ocak","Subat","Mart","Nisan","Mayis","Haziran","Temmuz","Agustos",
			"Eylul","Ekim","Kasim","Aralik"};
	int[] gun=new int[12];
	public void doayAyEkle()
	{
		for(int i=0;i<gun.length;i++) gun[i]=i+1;
	}
	public void doYazdir()
	{
		for(int i=0;i<gun.length;i++) System.out.println(gun[i]+". "+aylar[i]);
	}
}

public class Ornek08_Diziler 
{
	public static void main(String[] args) 
	{
		Aylar2 aylar=new Aylar2();
		aylar.doayAyEkle();
		aylar.doYazdir();
	}

}
