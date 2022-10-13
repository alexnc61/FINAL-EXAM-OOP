import java.util.Random;
import java.util.Scanner;
public class Accoustic extends Guitar {
	public Accoustic() {
		super();
		guitarSoundType = random();
	}
	//Random generator
	private String random() {
		Random rand = new Random();
		String guitarSound = "";
		int choose = rand.nextInt(2);
		if (choose == 0) {
			guitarSound = "bright";
		}
		else if (choose ==1) {
			guitarSound = "warm";
		}
		return guitarSound;
	}
	@Override
	public void display() {
		System.out.println("Acoustic Gitar" + " - " + guitarSoundType);
	}
	
	
}
