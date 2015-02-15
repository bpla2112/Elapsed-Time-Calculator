/**
 * @author Bernardo Pla
 */
public class ElapsedTimeCalculator 
{
    //instance variables
    private int startTime; //establishes a start time
    private int endTime; // establishes an end time
    
    /**
     * Constructs a ElabsedTimeCalculator object
     * 
     * @param startTime the time started
     * @param endTime the time ended 
     * This assumes that the end time is later in the day
     */
    public ElapsedTimeCalculator (int startTime, int endTime)
    {
        //initialize instance vars
        this.startTime = startTime;
        this.endTime = endTime;
        // all other instance vars are initialized to zero
    }
    
    // Call the start time
    public int getsTime()
    {
        return startTime;
    }
    // convert the start time to a decimal
    public double getstartTime()
    {
        return startTime / 100.0 ;// conversion factor for start time
    }
    //Call the end time
    public int geteTime()
    {
        return endTime;
    }
    // convert the end time to a decimal
    public double getendTime()
    {
        return endTime / 100.0; // conversion factor for the end time
    }
    // call the results for the start and end times
    public int starthours() //hours for start
    {
        return (int) getstartTime();
    }
    public int endhours()
    {
        return (int) getendTime();
    }
    // minutes are needed for the start and end times
    public int startMin()
    {
        return (int) Math.round((getstartTime()-(starthours()))*100);
    }
    public int endMin()
    {
        return (int) Math.round((getendTime()-(endhours()*1.0))*100);
    }
    // must now convert the hours to minutes for the start and end times
    public int convertStart()
    {
        return starthours() * 60;
    }
    public int convertEnd()
    {
        return endhours() * 60;
    }
    // compute the total amount of minutes for the start and end times
    public int totalStart()
    {
        return convertStart() + startMin();
    }
    public int totalEnd()
    {
        return convertEnd() + endMin();
    }
    // now it is time to compute the time that has passed
    public double timeElapsed()
    {
        return Math.abs(totalStart() - totalEnd());
    }
    public double timeTwo()
    {
        return timeElapsed()/ 60.0;
    }
    public double elapsedHours()
    {
        return (int) timeTwo();
    }
    public double Min()
    {
        return (double) (((timeTwo()-(elapsedHours()))*100.0));
    }
    public double minElapsed()
    {
        return Math.round(Min()*60)/100;
    }
    
} // end class declaration
