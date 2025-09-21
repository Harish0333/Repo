package com.task1;

public enum Movie 
{
	Pathaan, Sir,Hit, Geme_over, Lost;
	Movie() {
	}
	public void movieMethod()
	{
	System.out.println(Movie.this);
	}
}
