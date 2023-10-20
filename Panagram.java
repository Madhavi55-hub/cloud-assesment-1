package YoutubeStrings;

import java.util.HashSet;

public class Panagram 
{
	public static void main(String[] args) {
		String s="Pack My Box With Five Dozen Liquor Jugs";

	HashSet<Character> hs=new HashSet<>();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>=97&&ch<=122||ch>=65&&ch<=90)
		{
			hs.add(ch);
		}
	}
	if(hs.size()==26)
	{
		System.out.println("panagram");
	}
	else
	{
		System.out.println("not panagram");
	}
	}
	
			
}
