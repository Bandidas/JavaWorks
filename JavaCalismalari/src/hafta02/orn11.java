package hafta02;

class primitiveVeriTipleri5
{
	float sayi;

	public float getSayi() 
	{
		return sayi;
	}

	public void setSayi(float sayi) 
	{
		this.sayi = sayi;
	}
	
}

public class orn11 
{
	public static void main(String[] args) 
	{
		primitiveVeriTipleri5 tip1=new primitiveVeriTipleri5();
		tip1.setSayi(1907.1907F);
		System.out.println("Float tipindeki sayinin degeri: "+tip1.getSayi());
	}

}
