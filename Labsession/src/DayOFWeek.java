
public class DayOFWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayNumber = 5;
		
		switch (dayNumber) {
		
			case1:
				System.out.println("momday");
			break;
			case2:
				System.out.println("Tuesday");
			break;
			case3:
				System.out.println("Wednesday");
			}break;
			case4:
			System.out.println("Thursday");
			break;
			case5:
			System.out.println("Friday");
			break;
			case6:
			System.out.println("Saturday");
			break;
			case7:
		System.out.println("Sunday");
			break;
			default:
				System.out.println("Invalid");
		}
	}
}Sure! Here's the same Day of the Week program using a switch statement in Java:

public class DayOfWeekSwitch {

    public static void main(String[] args) {
        int dayNumber = 4; // You can change this value to test different days

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}
