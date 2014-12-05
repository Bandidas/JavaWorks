package Java;
class IlkMesaj
{
	public void durumMesaj()
	{
		System.out.println("Bu metot ile ekrana mesaj yazdırıyoruz.");
	}
}

public class ornek03 
{
	public static void main(String[] args)
	{
		IlkMesaj mesaj1=new IlkMesaj();
		mesaj1.durumMesaj();
		IlkMesaj mesaj2=new IlkMesaj();
		mesaj2.durumMesaj();
	}
}
