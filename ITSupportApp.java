/*ITSupportApp
04/12/2021
Author @JP Cavalcante
*/

import java.util.Arrays;

public class ITSupportApp
{
	public static void main(String args[])
	{
		//Declare variables
		int choice = 0;

		//Create Object
		ITSupport support = new ITSupport();


		//Input
		//Used Do-while so the menu is executed once when its run and then gets the input
		do
		{	//call for the Menu
			choice = support.PrintMenu();

			switch (choice)
			{
				case 1:
				{	//Enter new item
					support.EnterNewItem();

					break;
				}

				case 2:
				{	//Display last item
					support.DisplayLastItem();

					break;
				}

				case 3:
				{
					//Display Highest priority
					//Process & Output
					//Function to cut dependence
					support.DisplayHighestPriority();

					break;

				}

				case 4:
				{	//Display Lowest priority
					//Process & Output
					//Function to cut dependence
					support.DisplayLowestPriority();

					break;

				}

				case 5:
				{	//Display Average of priority
					//Process & Output
					//Function to cut dependence
					support.DisplayAveragePriority();

					break;
				}
			}


		} while (choice != 6);//Exit application
		System.out.println("Thank you for using IT Support");

	}
}