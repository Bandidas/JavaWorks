package hafta02;

class primitiveVeriTipleri6
{
	double sayi;

	public double getSayi() 
	{
		return sayi;
	}

	public void setSayi(double sayi) 
	{
		this.sayi = sayi;
	}
	
}

public class orn13 
{
	public static void main(String[] args) 
	{
		primitiveVeriTipleri6 tip1=new primitiveVeriTipleri6();
		tip1.setSayi(1907.1907);
		System.out.println("Double tipindeki sayinin degeri: "+tip1.getSayi());
	}

}
