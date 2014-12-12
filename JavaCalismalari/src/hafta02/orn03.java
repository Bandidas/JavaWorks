package hafta02;

class PrimitiveVeriTipleri1
{
	byte sayi;
	
	public void setSayi(byte sayi)
	{
		this.sayi=sayi;
	}
	public  byte getSayi()
	{
		return sayi;
	}
}

public class orn03 
{

	public static void main(String[] args) 
	{
		PrimitiveVeriTipleri1 tip1=new PrimitiveVeriTipleri1();
		tip1.setSayi((byte)50);
		System.out.println(tip1.getSayi());
	}

}
