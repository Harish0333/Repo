package com.task2;

public class TravelItineraryPlanner 
{
	public static void main(String[] args) 
	{
		ItineraryPlanner itplanner=new ItineraryPlanner();
		
		Destination destination1=new Destination("Paris");
		Destination destination2=new Destination("London");
		
		Activity activity1=new Activity("Visit Eiffel Tower","(Morning)");
		Activity activity2=new Activity("Louvre Museum ","(Afternoon)");
		Activity activity3=new Activity("British Museum ","(Morning)");
		Activity activity4=new Activity("London Eye ","(Afternoon)");
		
		destination1.add_activities(activity1);
		destination1.add_activities(activity2);
		destination2.add_activities(activity3);
		destination2.add_activities(activity4);
		
		itplanner.add_destinations(destination1);
		itplanner.add_destinations(destination2);
	}

}
