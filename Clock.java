package ChallengeExercise;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Clock
{
    private String time;

    public Clock()
    {

    }

    //Setting the time to 24hr
    public void set24hrTime()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("kk:mm:ss");
        time= formatter.format(date);
    }

    //setting the time to 12hr
    public void set12hrTime()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        time = formatter.format(date);

    }

    //Display the time
    public void displayTime()
    {
        System.out.print("\nTime:\t");
        System.out.print(time);
    }



}
