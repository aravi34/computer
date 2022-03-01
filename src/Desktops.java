
public class Desktops implements Hardware, Software {
	private void desktopModel() {
		System.out.println(" Dell Inspiron ");

	}

	@Override
	public void softwareResources() {
		System.out.println(" Consists of system and application software ");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println(" Consists of Keyboard mouse monitor ");
		
	}
	public static void main(String[] args) {
		Desktops de = new Desktops();
		de.desktopModel();
		de.softwareResources();
		de.hardwareResources();
	}
	
	

}
