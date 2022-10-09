
public class Electric extends Guitar{
	
	private int switchPosition;
	private Compo compo; 
	
	
	
	public Electric(int tone, int volume, int switchPosition) {
		super();
		this.compo = new Compo(tone,volume);
		this.switchPosition = switchPosition;
		guitarSoundType = guitarSoundType();
		
	}


	private String guitarSoundType() {
		String guitarSound = "";
		if (switchPosition == 1) {
			guitarSound = "Funk";
		}
		else if (switchPosition ==2 ) {
			guitarSound = "Jazz";
		}
		else if (switchPosition == 3) {
			guitarSound = "Blues";
		}
		else if (switchPosition == 4) {
			guitarSound = "rock";
		}
		return guitarSound;
	}
	@Override
	public void display() {
		System.out.println("Electric Gitar" + " - " + guitarSoundType + " - " + compo.getTone() + " - " + compo.getVolume() + " - " + switchPosition);
	}
}
