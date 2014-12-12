package hafta02;

class StatikDegiskenler
{
	public static String isim;
	public static String soyisim;
	
	private static String babaAdi;
	private static final int TC=19071907;
	/*final anahtar kelimesi bu deðiskenin tuttugu degerin program boyunca 
	 * degismemesini saglar.*/
	public StatikDegiskenler(String isim, String soyisim,String babaAdi)
	{
		this.isim=isim;
		this.soyisim=soyisim;
		this.babaAdi=babaAdi;
	}
	public void doYazdir()
	{	
		System.out.println("Ad: "+isim);
		System.out.println("Soyad: "+soyisim);
		System.out.println("Baba Adi: "+babaAdi);
		System.out.println("TC: "+TC);
	}
}

public class orn20 
{
	public static void main(String[] args) 
	{
		StatikDegiskenler degisken1=new StatikDegiskenler("Caglanur", "SAGLAM", "Cemal");
		degisken1.doYazdir();
	}

}
