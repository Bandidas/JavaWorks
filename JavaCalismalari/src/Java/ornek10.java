package Java;

import java.util.Scanner;

class Cinsiyet
{
	String cinsiyet;
	public void setCinsiyet(String cinsiyet)
	{
		this.cinsiyet=cinsiyet;
	}
	public String getCinsiyet()
	{
		return cinsiyet;
	}
	public void doYazdir()
	{
		System.out.println("cinsiyet: "+cinsiyet);
	}
}

public class ornek10 {

	public static void main(String[] args) 
	{
		Cinsiyet cinsiyet1=new Cinsiyet();
		cinsiyet1.setCinsiyet("Bayan");
		cinsiyet1.doYazdir();
		Cinsiyet cinsiyet2=new Cinsiyet();
		System.out.println("cinsiyet gir:");
		Scanner input =new Scanner(System.in);
		String cinsiyet=input.next();
		cinsiyet2.setCinsiyet(cinsiyet);
		cinsiyet2.doYazdir();
	}

}
