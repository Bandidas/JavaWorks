package hafta02;

class PrimitiveVeriTipleri3
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
}

public class orn07 
{

	public static void main(String[] args) 
	{
		PrimitiveVeriTipleri3 tip1=new PrimitiveVeriTipleri3();
		tip1.setSayi(1907);
		System.out.println("Integer tipindeki sayi: "+tip1.getSayi());
	}

}
