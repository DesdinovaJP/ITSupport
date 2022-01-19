/*ITSupport
04/12/2021
Author @JP Cavalcante
*/

import java.util.Scanner;

public class ITSupport
{
	//Declare variables
	private int priority [] = new int [10];
	private int staffId [] = new int [10];
	private String name [] = new String [10];
	private String department [] = new String [10];
	private int nextItemIndex = 0;

	public int PrintMenu()
	{
		Scanner hp = new Scanner (System.in);
		System.out.println("                                                            ");
		System.out.println("Application Menu - Item Type: IT Support");
		System.out.println("************************************************************");
		System.out.println("Press 1 to provide details of an item");
		System.out.println("Press 2 to display the details of last entered item");
		System.out.println("Press 3 to display the request with highest priority");//min
		System.out.println("Press 4 to display the request with lowest priority");//max
		System.out.println("Press 5 to display the average priority of requests entered");//avg
		System.out.println("Press 6 to exit application");
		System.out.println("************************************************************");
		System.out.println("Enter your choice...");
		return hp.nextInt();
	}

	public void EnterNewItem()
	{
		Scanner hp = new Scanner (System.in);
		int p = 0;
		//Loop for invalid entry
		do
		{
			System.out.println("Please enter priority (1- high, 2- medium, 3- low).");
			p = hp.nextInt();
			if ((p < 1) || (p > 3))
			{
				System.out.println("That is not a valid entry");
			}
			else
			{
				priority[nextItemIndex] = p;
			}
		} while ((p < 1) || (p > 3));

		System.out.println("Please enter your Staff ID (E.g 1111).");
		staffId[nextItemIndex] = hp.nextInt();
		System.out.println("Please enter your first name.");
		name[nextItemIndex] = hp.next();
		System.out.println("Please enter your department (E.g IT_Support)");
		department[nextItemIndex] = hp.next();
		nextItemIndex++;

	}

	public void DisplayLastItem()
	{	//Loop for when theres no previous entry to display
		int lastItemIndex = nextItemIndex -1;
		if (lastItemIndex == -1)
		{
			System.out.println("No items to display yet");
		}
		else
		{
			System.out.println("Last item's info: ");
			DisplayItem(lastItemIndex);
		}
	}

	public void DisplayItem(int index)
	{	//Decided to put this code in a method to avoid repeating it
		System.out.println("Priority: " + priority[index]);
		System.out.println("Staff ID: " + staffId[index]);
		System.out.println("First Name: " + name[index]);
		System.out.println("Department: " + department[index]);
	}


	public void DisplayHighestPriority()
	{	//calculator called at each display to be more secure when computing
		ITCalculator calculator = new ITCalculator();
		int min = calculator.computeMin(priority, nextItemIndex);
		System.out.println("The highest priority is: " + min);
		for (int i = 0; i < priority.length; i++)
		{
			if (priority[i] == min)
			{
				DisplayItem(i);
				break;
			}
		}

	}

	public void DisplayLowestPriority()
	{	//calculator called at each display to be more secure when computing
		ITCalculator calculator = new ITCalculator();
		int max = calculator.computeMax(priority, nextItemIndex);
		System.out.println("The lowest priority is: " + max);
		for (int i = 0; i < priority.length; i++)
		{
			if (priority[i] == max)
			{
				DisplayItem(i);
				break;
			}
		}

	}

	public void DisplayAveragePriority()
	{	//calculator called at each display to be more secure when computing
		ITCalculator calculator = new ITCalculator();
		double avg = calculator.computeAvg(priority, nextItemIndex);
		System.out.println("The average of priority is: " + avg);
	}
}