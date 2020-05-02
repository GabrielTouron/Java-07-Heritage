public class Hangar {

	public static void main(String[] args) {
		Car toto = new Car("Ford", 33);
		System.out.println(toto.doStuff());
		
		Boat tata = new Boat("Zodiac", 44);
		tata.setKilometers(56);
		
		System.out.println(tata.doStuff());

	}

}
