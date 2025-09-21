package com.task2;

import java.util.Scanner;

/*
 *   Sreaching for char/substring
 *      |-public boolean contains(charSequence sc)
 *        as it is parameter having the charSequence 
 *        we can pass string ,stringBuffer as well as
 *        StringBuilder.
 *        
 *      |- public int indexOf(char ch)
 *      |- public int indexOf(String s)
 *      |- public int indexOf(char ch,int fromIndex)
 *      |- public int indexOf(String s,int fromIndex)
 *      
 *      |- public int lastIndexOf(char ch)
 *      |- public int lastIndexOf(String s)
 *      |- public int lastIndexOf(char ch,int fromIndex)
 *      |- public int lastIndexOf(String s,int fromIndex)
 */
public class Sample02 
{
	String url = "http//localhost:8081/myString";

	public String geturl() 
	{
		return url;
	}

	public String setUrl(String urlpattern) 
	{
		String url = null;
		if (this.url.contains("8081")) 
		{
			url = urlpattern;
		}
		return "http//localhost:" + url + "/myString";

	}

	public static void main(String[] args) {
		Sample02 s = new Sample02();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url pattern number which you want to change");
		String url = sc.next();
		System.out.println(s.geturl());
		System.out.println(s.setUrl(url));

		/*
		 * In the below case ____________________________________________________ >
		 * Equal method will check the content from starting so the starting of s1 is
		 * 'h' and the starting of 2nd string object is p so it will return false as
		 * both having the different character
		 * 
		 * > compareTo method will return the difference between the character because
		 * it will start checking with 'h' whose unicode is 104 and the unicode of 'p'
		 * is 112 then they are different then it will substract 104-112 which is -8
		 * because we know in compare to if the string character not matched it will
		 * check if the 1st string character is smaller then the 2nd string character it
		 * will return the result as -ve.
		 * 
		 * >contains method will check from the starting from h in string 1 and check
		 * any character start from p i start it wil again check with the next character
		 * of the word "program" if every character matched then it will return true
		 * otherwise it will return false.
		 * 
		 */
		String s1 = "hi good morning we are going with the strign programs";
		System.out.println(s1.equals("program"));
		System.out.println(s1.compareTo("program"));
		System.out.println(s1.contains("program"));
		System.out.println("------------------------------");
		String s2 = "hi good morning we are going with the programs on String";
		System.out.println(s2.equals("program"));
		System.out.println(s2.compareTo("program"));
		System.out.println(s2.contains("program"));
		System.out.println("-------------------------------");
		/*
		 * contain method is case senstive if we compare the string which is small
		 * letter lets say String s="program" and if we compare with the capital letter
		 * "Program" it will return false. and there is no containIgnoreCase() present
		 * if we want to check then we can write the method known as toLowerCase()
		 */
		String s3 = "hi good morning we are going with the programs on String";
		System.out.println(s3.equals("Program"));
		System.out.println(s3.compareTo("Program"));
		System.out.println(s3.contains("Program"));
		System.out.println(s3.toLowerCase().contains("program"));

		/*
		 * we can't compare character by using compareTo because compareTo parameter is
		 * taking char sequence not the character.
		 * 
		 * we can pass character as a string format in the paramter of the compareTo
		 * method.
		 */
		System.out.println();
		String s4 = "hello everyone S";
		// System.out.println(s4.compareTo('S'));
		System.out.println(s4.compareTo("J"));
		System.out.println();

		/*
		 * contain method will tell that the sreaching string is present or not but if
		 * we want to find where ir that sreaching character are there then we can go
		 * with the method known as indexOf()
		 * 
		 * so indexOf method return the place of the sreaching character (place means
		 * the index position)
		 *
		 * if there are multiple character present with the same as the sreaching
		 * character then it will return the index position of the starting index of the
		 * sreaching element because the sreaching will alwys start from the 0 index of
		 * string.(you can also call it as 1st occurance sreaching ). it start sreaching
		 * from 0 index forward direction
		 * 
		 * same rules apply for the index of method whose parameter is of string type.
		 * 
		 * If you want the lastIndex of the sreaching element string then we can use
		 * lastIndexOf() it will return the last index of the sreaching string. it start
		 * sreaching from lastIndex to backward direction.
		 * 
		 * If you want to find the the sreaching element from the middle of the index
		 * means there is no pre define method instead of that we can write index of
		 * method with the sreaching position. for sreaching from firstoccurance method
		 * name is : indexOf(char , fromIndex); indexOf(String,fromIndex);
		 * 
		 * If you want to find the sreaching element from the choice place also from the
		 * lastIndex onwards then the method is lastIndexOf(Char,fromIndex)
		 * 
		 * If the index which we are sreaching is not available then indexof will return
		 * -1 this will follow in lastIndexOF method also
		 * 
		 * If in the index of method we are sreaching the string from the index which is
		 * not present means if i sreach with the index from -ve then it will sreach the
		 * character from the 0 index onwards because there is 1 condition written in
		 * index of that if( index <0) index=0;
		 * 
		 * above rule for lastIndexof that if we sreaching the character from the index
		 * which is not present for example we are sreaching as lastIndexOf('a',-5) it
		 * will sreach from -5 index to backward direction and as a result it will give
		 * the output as -ve that is -1. because in backward sreaching there will be no
		 * any index present.
		 * 
		 * 
		 * if the indexof method if we are sreaching the character from the the end of
		 * the length of the string then index of sreach the element from the choice
		 * place to forward direction as a result no any index is there it return the
		 * ans in -ve that is -1.
		 * 
		 * 
		 * if the lastindexof method if we are sreaching the element from the choice
		 * index position and the index is greater than the choice index length then
		 * there is one condition in index of method. if(index > length)
		 * index=length()-1; then it will sreach from length -1 backward direction.
		 * 
		 *
		 * if the sreach character is the same place of the choice
		 * 
		 * 
		 * 
		 * Note: IndexOf method we will never going to use in for finding the index of
		 * the character most of the time index of method is used to sreaching.
		 * 
		 * 
		 * 
		 * So there is the confusion that for sreaching we are using indexOf method for
		 * finding also we have to use indexOf method that's why from java 1.4 onwards
		 * the things are seperated so for finding the thing we are using the method
		 * contain() and for sreaching in which index we are going to use indexOf()
		 * 
		 * 
		 * 
		 */

		String s5 = "hello welcome to nareshit to lab";
		System.out.println(s5.contains("i"));
		System.out.println(s5.indexOf('i'));
		System.out.println(s5.indexOf('o'));
		System.out.println(s5.indexOf("to"));
		System.out.println(s5.lastIndexOf('i'));
		System.out.println(s5.lastIndexOf("to"));
		System.out.println("length of the string " + s5.length());
		System.out.println(s5.indexOf('t', (s5.length() / 2)));
		System.out.println(s5.indexOf("it", (s5.length() / 2)));
		System.out.println(s5.lastIndexOf('l', 5));
		System.out.println(s5.indexOf('A'));
		System.out.println(s5.lastIndexOf('A'));
		System.out.println(s5.indexOf('e', -5));
		System.out.println(s5.indexOf('a', 32));
		System.out.println(s5.indexOf('e', 1));
		System.out.println(s5.indexOf("nareshit"));
		System.out.println(s5.lastIndexOf("nareshit"));

		if (s5.indexOf("nareshit") != -1) {
			System.out.println("The word nareshit is present");
		} else {
			System.out.println("The word nareshit is not present");
		}
		sc.close();

	}
}
