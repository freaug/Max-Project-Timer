/*
Code by Eddie Farr -- www.eddiefarr.com

This is an alpha version of projectTimer.

It times how long you have been working on a max patch

todo:
	save time when patcher closes or when the object is deleted
	output the time as a txt file
*/

import com.cycling74.max.*;

public class projTimer extends MaxObject
{
	long startTime = System.currentTimeMillis();

	public projTimer(){
		declareIO(1,1);
		createInfoOutlet(false);
		setInletAssist(new String[] {"Bang to see total time in Max Window or from 1st outlet"});
		setOutletAssist(new String[] {"Outputs time as hours:minutes:seconds:millis"});
	}

	public void bang(){
		post("Total time is: " + convertTime());
		outlet(0, convertTime());
	}
	
	public long calcTime(){
		long runTime = System.currentTimeMillis() - startTime;
		return runTime;	
	}

	public String convertTime(){
		long millis = calcTime();
		long second = (millis / 1000) % 60;
		long minute = (millis /(1000 * 60)) % 60;
		long hour = (millis / (1000 * 60 * 60)) % 24;

	 	String formatedTime = String.format("%02d:%02d:%02d:%d", hour, minute, second, millis);
		return formatedTime;
	}
}

























