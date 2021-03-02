public class DmvSimulator {
	
	public static void main(String[] args) {
		
		int spot = (int) (Math.random() * (200 - 100)) + 100;
		
		System.out.printf("Hello, welcome to the DMV! \nYou're spot in line is %d \nPlease wait until your number is called\n", spot);
		
		int x = spot + 1;
		int y = 0;
		
		while (x > spot & x < 200) {
			System.out.printf("Number %d\n", x);
				x++;
		}
		
		if (x == 200) {
			while (y <= spot) {
			System.out.printf("Number %d\n", y);
			y++;
			
				if (y == spot - 1) {
					System.out.println("Number " + spot + ": You do NOT have the required paperwork! Get the right paperwork and wait in line again!");
					System.exit(0);
				}
			}
		}
	}
}