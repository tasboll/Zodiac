/**
 * 
 */
import java.util.*;
/**
 * @author tasiabolling
 *
 */
public class bdaySign {
	
	public static void main(final String[] args) {
		
		  String sign = "Unknown";
	        String bMonth = "Unknown";
	        // Create the Scanner object for input:
	        final Scanner sc = new Scanner(System.in);

	        	
	        // Create the input statements:
	        System.out.print("Enter your birth month as an integer (1 for January, 6 for June, ):");
	        final int month = sc.nextInt();
	        String msg = (month >= 1 && month <= 12)?"Valid month" : "invalid month entered was " + month;
	        System.out.println(msg);
	        System.out.print("Enter your birth day as an integer (1 to 31 ):");
	        final int day = sc.nextInt();
	        msg = (day >=1 && day <=31)?"Valid date" : "Invalid date entered was " + day;
	        System.out.println(msg);
	        if (day > 31 || day <1 || month < 1 || month > 12 ) {
	            System.exit(-1);
	        }
	        
	        switch (month) {
            case (1): { // we know now it is January
                // Aquarius: January 21 to February 20
                // Capricorn: December 21 to January 20
                bMonth = "January";
                if (day >= 21) {
                    sign = "Aquarius";
                } else {
                    sign = "Capricorn";
                }
                break;

            }
            case (2): {
                // Aquarius: January 21 to February 20
                // Pisces: February 21 to March 20
                bMonth = "February";
                if (day < 21) {
                    sign = "Aquarius";
                } else {
                    sign = "Pisces";
                }

                break;
            }
            case (3): {
                // Pisces: February 21 to March 20
                // Airies: March 21 to April 20
                bMonth = "March";
                if (day < 21) {
                    sign = "Pisces";
                } else {
                    sign = "Airies";
                }
                break;
            }
            case (4): {
                // Aries: March 21 to April 20
                // Taurus: April 21 to May 20
                bMonth = "April";
                if (day < 21) {
                    sign = "Aries";
                } else {
                    sign = "Taurus";
                }
                break;
            }
            case (5): {
                // Taurus: April 21 to May 20
                // Gemini: May 21 to June 20
                bMonth = "May";
                if (day < 21) {
                    sign = "Taurus";
                } else {
                    sign = "Gemini";
                }
                break;
            }
            case (6): {
                // Gemini: May 21 to June 20
                // Cancer: June 21 to July 20
                bMonth = "June";
                if (day < 21) {
                    sign = "Gemini";
                } else {
                    sign = "Cancer";
                }
                break;
            }
            case (7): {
                // Cancer: June 21 to July 20
                // Leo: July 21 to August 20
                bMonth = "July";
                if (day < 21) {
                    sign = "Cancer";
                } else {
                    sign = "Leo";
                }
                break;
            }
            case (8): {
                // Leo: July 21 to August 20
                // Virgo: August 21 to September 20
                bMonth = "August";
                if (day < 21) {
                    sign = "Leo";
                } else {
                    sign = "Virgo";
                }
                break;
            }
            case (9): {
                // Virgo: August 21 to September 20
                // Libra: September 21 to October 20
                bMonth = "September";
                if (day < 21) {
                    sign = "Virgo";
                } else {
                    sign = "Libra";
                }
                break;
            }
            case (10): {
                // Libra: September 21 to October 20
                // Scorpio: October 21 to November 21
                bMonth = "October";
                if (day < 21) {
                    sign = "Libra";
                } else {
                    sign = "Scorpio";
                }
                break;
            }
            case (11): {
                // Scorpio: October 21 to November 20
                // Sagittarius: November 21 to December 20
                bMonth = "November";
                if (day < 21) {
                    sign = " Scorpio";
                } else {
                    sign = "Sagittarius";
                }
                break;
            }
            case (12): {
                // Sagittarius: November 21 to December 20
                // Capricorn: December 21 to January 20
                bMonth = "December";
                if (day < 21) {
                    sign = "Sagittarius";
                } else {
                    sign = "Capricorn";
                }
                break;
            }
            default: { // if none of the other statements are true, the month is invalid
                System.out.println("You entered an invalid month, it must be between 1 and 12");
            }
        }
        System.out.println("Your birthday is " + bMonth + " " + day + ".");
        System.out.println("Your sign is " + sign + ".");
        
        sc.close();
        
	        	
	}

}
