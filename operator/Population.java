class Population
{
  public static void main(String[]args)
{
  long secondInYear=365*24*60*60;
  long birthInYear=secondInYear/7;
  long deathInYear=secondInYear/13;
  long immigrantInYear=secondInYear/45;
  long currentPopulation=312032486;
  long fiveYearPopulation=currentPopulation+((birthInYear-deathInYear+immigrantInYear)*5);

   System.out.println("current Population-"+currentPopulation);
   System.out.println("five Year Population-"+fiveYearPopulation);
}
}
   
   