package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Example08RoutineDataManipulations {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		
		System.out.println(colors);
		Collections.reverse(colors);
		System.out.println(colors);
		
		Collections.sort(colors);
		System.out.println(colors);
		
		Collections.sort(colors, Collections.reverseOrder());
		
		System.out.println(colors);
		
		//Collections.fill(colors, "Yellow");
		//System.out.println(colors);
		
		Collections.swap(colors, 0, 2);
		
		System.out.println(colors);
		
		Collections.addAll(colors, "Yellow", "Orange", "Blue", "Turquoise", "Magenta");
		
		System.out.println(colors);
		
		TreeSet<String> newColors = new TreeSet<String>(colors);
		
		colors.add("Here");
		
		System.out.println(newColors);
		
		newColors.addAll(colors);
		
		System.out.println(newColors);
		
		colors.addAll(newColors);
		
		System.out.println(colors);
		
	}

}
