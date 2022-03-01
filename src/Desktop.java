
public class Desktop extends Computer {
private void desktopSize() {
System.out.println("Desktop Size: Denoted as Internal Hard Drive which is 500 GB and External Hard Drive which is 1TB");
}
public static void main(String[] args) {
	Desktop de = new Desktop();
	de.computerModel();
	de.desktopSize();
}
}
