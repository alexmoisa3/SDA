package ro.unitbv.javadatatype;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {
		double[] temperaturi = { 37.2, 35.8, 36.8, 38, 39.2, 36.2 };
		List<Double> list1 = new ArrayList<Double>();
		List<Double> list2 = new ArrayList<Double>();
		List<Integer> list3 = new ArrayList<Integer>();// pozitii din sirul original pt temp <37
		List<Integer> list4 = new ArrayList<Integer>();// pozitii din sirul original pt temp >37

		for (int j = 0; j < temperaturi.length;)
			for (double x : temperaturi) {
				if (x < 37.0) {
					list1.add(x);
					list3.add(j);

				} else {
					list2.add(x);
					list4.add(j);

				}
				j++;
			}
		System.out.println("Temperaturi sub 37.0:");
		for (int i = 0; i < list1.size(); i++)
			System.out.println("Pacient:" + list3.get(i) + " " + list1.get(i));

		System.out.println("\nTemperaturi peste 37.0:");
		for (int i = 0; i < list2.size(); i++)
			System.out.println("Pacient:" + list4.get(i) + " " + list2.get(i));

	}

}
