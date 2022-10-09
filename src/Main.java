import java.util.Vector;
import java.util.Scanner;
public class Main {
	Vector<Guitar> listGuitar = new Vector<>();

	Scanner scanner = new Scanner(System.in);
	
	public void mainMenu() {

		System.out.println("1. Build Guitar");
		System.out.println("2. Display List of Guitar");
		System.out.println("3. Exit");
		
	}
	
	public void buildGuitar() {
		System.out.println("1. Acoustic");
		System.out.println("2. Electric");
		System.out.println("3. Acoustic Electric");
		int input;
		input = scanner.nextInt();
		if (input == 1) {
			listGuitar.add(new Accoustic());
			System.out.println("Successfully added!");
			scanner.nextLine();

		}
		else if (input == 2 ) {
			int switchPosition,tone,volume;
			System.out.print("Input Switch Position: ");
			switchPosition=scanner.nextInt(); 
			scanner.nextLine();
			System.out.print("Input Tone: ");
			tone=scanner.nextInt(); scanner.nextLine();
			System.out.print("Input Volume: ");
			volume=scanner.nextInt(); scanner.nextLine();
			listGuitar.add(new Electric(tone,volume,switchPosition));
			System.out.print("Successfully added!");
			scanner.nextLine();
		}
		else if (input == 3) {
			listGuitar.add(new AcousticElectric());
			System.out.println("Successfully added!");
			scanner.nextLine();
		}
		
	}
	
	public void displayGuitar() {
		System.out.println("[GuitarType]-[GuitarSoundType]-[Tone]-[Volume]-[SwitchPosition]");
		for (Guitar guitar : listGuitar) {
			guitar.display();
		}
		scanner.nextLine();
	}
	public Main() {
		// TODO Auto-generated constructor stub
		boolean isRun = true;
		Integer menu = -1;
		
		do {
			mainMenu();
			do {
				try {
					System.out.print("Choose menu[1..3]: ");
					menu = scanner.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					menu = -1;
				}
				scanner.nextLine();
				switch (menu) {
				case 1:
					buildGuitar();
					break;
				case 2:
					displayGuitar();
					break;
				case 3:
					isRun = !isRun;
					break;
					 
				

				default:
					break;
				}
			} while (menu< 1 || menu > 3);
			
		} while (isRun);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
