package YoutubeStrings;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrays {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			numbers.add(i);
		}
		System.out.println("the numbers are:"+numbers);
		Collections.shuffle(numbers);
		System.out.println("the shuffled numbers are:"+numbers);
	}

}
