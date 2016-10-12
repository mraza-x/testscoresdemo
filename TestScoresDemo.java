import java.util.*;

/**
  Mohammed Raza
  CSC 162 - Lab6 #1 (main)
*/

public class TestScoresDemo
{

   public static void main(String[] args)
   {

   	double[] badScores = {97.5,66.7,88.0,101.0,99.0};

   	double[] goodScores = {97.5,66.7,88.0,100.0,99.0};

   	TestScores scores = new TestScores(badScores,goodScores);

   	System.out.println("Exception: " + scores.getInvalid());

   	System.out.println("Average: " + scores.getTest());

      }
   }

