package com.task2;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner 
{
	public static List<Destination>destination=new ArrayList<Destination>();;
	public void add_destinations(Destination des)
	{		
		destination.add(des);
		System.out.println(des);
	}
	 public static List<Destination> getDestinations() 
	 {
	    return destination;
	 }
}
