package hafta02;

class PrimitiveVeriTipleri2
{
	short sayi;

	public short getSayi() 
	{
		return sayi;
	}

	public void setSayi(short sayi) 
	{
		this.sayi = sayi;
	}
}

public class otn05 
{
	public static void main(String[] args) 
	{
		PrimitiveVeriTipleri2 tip1=new PrimitiveVeriTipleri2();
		tip1.setSayi((short)50);
		System.out.println("Short tipindeki sayi: "+tip1.getSayi());
	}

}
