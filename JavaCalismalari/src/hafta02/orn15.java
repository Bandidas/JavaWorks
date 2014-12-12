package hafta02;

class cinsiyet
{
	boolean cinsiyet;

	public boolean isCinsiyet() 
	{
		return cinsiyet;
	}

	public void setCinsiyet(boolean cinsiyet) 
	{
		this.cinsiyet = cinsiyet;
	}
}

public class orn15 
{
	public static void main(String[] args) 
	{
		cinsiyet cinsiyet1=new cinsiyet();
		cinsiyet1.setCinsiyet(true);
		System.out.println("Bayan mi? "+cinsiyet1.isCinsiyet());
	}

}
