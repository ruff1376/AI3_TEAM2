package MISSION.KGW;

public class Q03 {

    public static void main(String[] args) {
        for ( int i = 1; i <101; i++) {
			int ten = i / 10;
			int one = i % 10;

			boolean ten369 = ten ==3 || ten == 6 || ten == 9;
			boolean one369 = one ==3 || one == 6 || one == 9;
			
			
			if (ten369&&one369)
				System.out.println("**");
			else if (ten369||one369)
				System.out.println("*");
			else System.out.println(i);
			}
    }
}
