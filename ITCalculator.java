/*ITCalculator
04/12/2021
Author @JP Cavalcante
*/

public class ITCalculator
{

	//No constructor needed in this case

	//compute method
	//Pass the parameters here to keep the functions not dependant
	public double computeAvg(int values[], int numberOfItems)
	{
		//initialize
		int sum = 0;
		//for loop
		for (int i = 0; i < numberOfItems; i++)
		{
			sum = sum + values[i];
		}

		return (sum / numberOfItems);
	}


	public int computeMax(int values[], int numberOfItems)
	{
		//initialize
		int max = values[0];
		//for loop
		for (int i = 1; i < numberOfItems; i++)
		{
			if (max < values[i])
			{
					max = values[i];
			}
		}
		return max;
	}

	public int computeMin(int values[], int numberOfItems)
	{
		//inititalize
		int min = values[0];
		//for loop
		for (int i = 1; i < numberOfItems; i++)
		{
			if (min > values[i])
			{
				min = values[i];
			}
		}
		return min;
	}

}