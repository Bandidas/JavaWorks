package hafta04;

public class Ornek05_SicramaIfadeleri 
{
	public static void main(String[] args) 
	{
		boolean t=true;
		bir:{
			System.out.println("ikinci blok");
			iki:{
				System.out.println("ikinci blok");
				�c:{
					if(t) break iki;
					System.out.println("�c�nc� blok");
				}
			}
		}
	}

}
