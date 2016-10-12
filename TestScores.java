
/**
  Mohammed Raza
  CSC 162 - Lab6 #1 (class 1)
*/

public class TestScores
{
	private double[] badScores;
	private double[] goodScores;
	public double average;
	public String str;
	public int LCV;



   public TestScores(double[] bad, double[] good)
   {
	   badScores = bad;
	   goodScores = good;

   }

   public double getTest()
   {
	   try
	   {
		   for(LCV = 0; LCV <= 5; LCV++)
		   {

				if (badScores[LCV] < 0 || badScores[LCV] > 100)

					throw new IllegalArgumentException(); //****************
		   }

	   }


	   		catch (IllegalArgumentException e)
	   		{
		   		str = "Invalid score found";

	   		}


	   		finally
	   		{
				return (goodScores[0]+goodScores[1]+goodScores[2]+goodScores[3]+goodScores[4])/5;
			}

   }

    public String getInvalid()
    {
	   return str;
    }

}