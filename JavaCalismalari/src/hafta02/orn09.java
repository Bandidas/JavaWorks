package hafta02;

class PrimateveVeriTipleri4
{
	public long getSayi() {
		return sayi;
	}

	public void setSayi(long sayi) {
		this.sayi = sayi;
	}

	long sayi;
	
}

public class orn09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimateveVeriTipleri4 tip1=new PrimateveVeriTipleri4();
		tip1.setSayi(190719071907L);
		System.out.println("Long tipli sayinin degeri: "+tip1.getSayi());
	}

}
