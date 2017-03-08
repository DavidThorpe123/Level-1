
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		Handy.eat();
		System.out.println(Handy.getName());
		Smurf PapaSmurf = new Smurf("Papa Smurf");
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.isGirlOrBoy());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.getName());
		System.out.println(PapaSmurf.getName());
		System.out.println(PapaSmurf.getHatColor());
	}
}
