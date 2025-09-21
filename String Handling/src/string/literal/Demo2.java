package string.literal;

public class Demo2 
{

	public static void main(String[] args) 
	{
		String str = "My batch is batch 26";

  		String words []=   str.split("c");

	  for(String word : words)
	  {
		   System.out.println(word);
	  }
	}

}
