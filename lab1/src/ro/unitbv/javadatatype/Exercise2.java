package ro.unitbv.javadatatype;


	import java.util.ArrayList;
	import java.util.List;

	public class Exercise2 {

		public static void main(String[] args) {
			double[] temperaturi= {37.0, 35.5, 36.5, 38, 39, 36};
			List<Double> list1 = new ArrayList<Double>();
			List<Double> list2 = new ArrayList<Double>();
			List<Integer> list3 = new ArrayList<Integer>();//pozitii din sirul original pt temp <37
			List<Integer> list4 = new ArrayList<Integer>();//pozitii din sirul original pt temp >37
			
	for(int j=0;j<temperaturi.length;)
			for(double x: temperaturi) {
				if(x<37.0) {
					list1.add(x);
					list3.add(j);
					j++;
				}
				else {
					list2.add(x);
					list4.add(j);
					j++;
			}
			
			}
			System.out.println("temperaturi mai mici de 37.0:\n");
			for(int i=0;i<list1.size();i++) 
					System.out.println("id:" + list3.get(i) +" "+ list1.get(i));
					
					
			System.out.println("\ntemperaturi mai mari de 37.0:\n");
			for(int i=0;i<list2.size();i++)
				System.out.println("id:" + list4.get(i) +" "+ list2.get(i));
				
		}

	}
