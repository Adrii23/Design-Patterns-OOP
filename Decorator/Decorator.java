package passc;

public class Decorator {
	public static void main(String[] argv) {
			
			Furniture c1 = new Chair(); 				//creating a chair
			Furniture c2 = new Chair();
			
			c1 = new CutSeat("Ion",c1);
			c1 = new AssembleFeet("Vasile",c1);
			c1 = new AssembleBackrest("Petru",c1);
			c1 = new AssembleStabilizerBar("George",c1);
			c1 = new PackageChair("Costi",c1);
			System.out.println(c1.operate() + " Time cost : " + c1.cost() + " minutes\n");
				
			c2 = new CutSeat("Mircea",c2);
			c2 = new AssembleFeet("Theodor",c2);
			c2 = new AssembleStabilizerBar("Ovidiu",c2);
			c2 = new PackageChair("Tiberiu",c2);
			System.out.println(c2.operate() + " Time cost : " + c2.cost() + " minutes\n");
		
	}
}
