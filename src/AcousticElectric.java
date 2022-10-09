
public class AcousticElectric extends Guitar {
	private Compo compo;
	
	public AcousticElectric() {
		super();
		this.compo = new Compo (0,0);
		guitarSoundType = "crunch";
	}
	
	@Override
	public void display() {
		System.out.println("Acoustic ELectric Gitar" + " - " + guitarSoundType + " - 0 - 0");
	}
}
