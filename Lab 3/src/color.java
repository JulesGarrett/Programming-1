import java.util.Scanner;
public class color {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		System.out.println("Enter a wavelength in nm: ");
		Double wl;
		wl=myScan.nextDouble();
		if (wl>=380 && wl<450)
		{System.out.println("The color is Violet.");
		}
		else if (wl>=450 && wl<495)
		{System.out.println("The color is Blue.");
		}
		else if (wl>=495 && wl<570)
		{System.out.println("The color is Green.");
		}
		else if (wl>=570 && wl<590)
		{System.out.println("Teh color is Yellow.");
		}
		else if (wl>=590 && wl<620)
		{System.out.println("The color is Orange.");
		}
		else if (wl>=620 && wl<750)
		{System.out.println("The color is Red.");
		}
		else
		{System.out.println("The entered wavelength is not a part of the visible spectrum.");
		}
		
		}
	}
