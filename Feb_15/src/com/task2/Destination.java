package com.task2;

import java.util.ArrayList;
import java.util.List;

public class Destination 
{
	public String name;
	List<Activity>activity=new ArrayList<Activity>();
	public Destination(String name) 
	{
		super();
		this.name = name;
		this.activity=new ArrayList<Activity>();
	}
	public void add_activities(Activity activity)
	{
		this.activity.add(activity);
	}
	public List<Activity> getActivities() 
	{
        return activity;
    }
	@Override
	public String toString() {
		return "Destination : " + name + "\n" + activity;
	}
	
}
