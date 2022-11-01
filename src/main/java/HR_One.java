import java.util.*;
import java.util.stream.Collectors;

public class HR_One {

	public static long taumBday(int b, int w, int bc, int wc, int z) {
		long totCost=0;
		long lb=b; long lw=w; long lbc=bc; long lwc=wc; long lz=z;
		long diff=Math.abs(lbc-lwc);
		if(diff>lz){
			if(lbc>lwc)
				totCost=lwc*lw + lb*(lwc+lz);
			else
				totCost=lbc*lb + lw*(lbc+lz);
		}else{
			totCost=lb*lbc+lw*lwc;
		}
		return totCost;
	}




	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		List <Integer> lstTmt=new ArrayList<>();
		List <Integer> output=new ArrayList<>();
		k=k%a.size();
		if(k%a.size()==0){
			for(int i=k;i<a.size();i++) lstTmt.add(a.get(i));
		}else{
			k=a.size()-k;
			for(int i=k;i<a.size();i++) lstTmt.add(a.get(i));
			for(int i=0;i<k;i++) lstTmt.add(a.get(i));
		}
		for(int i=0;i<queries.size();i++)
			output.add(lstTmt.get(queries.get(i)));
		return output;
	}



    public static List<Integer> circularArrayRotationOld2(List<Integer> a, int k, List<Integer> queries) {
    	int[] qry = queries.stream().mapToInt(j->j).toArray();
    	if(k>a.size())	k=a.size()%k + 1;
    	if(k==0)k=a.size();
		LinkedList<Integer> ll = new LinkedList<Integer>(a);
    	for(int i=0;i<k;i++) {
			ll.addFirst(ll.removeLast());
    	}
    	int[] list = ll.stream().mapToInt(i->i).toArray();
		System.out.println(" roteted "  + Arrays.toString(list));
    	for(int x=0;x<qry.length;x++) {
    		qry[x]=list[qry[x]];
    	}
    	List<Integer> out = Arrays.stream(qry).boxed().collect(Collectors.toList());
    	return out;
    }




	public static List<Integer> circularArrayRotationOrigi(List<Integer> a, int k, List<Integer> queries) {
		int[] qry = queries.stream().mapToInt(j->j).toArray();
		k=a.size()%k;
		if(k==0)k=a.size();
		Queue<Integer> queue = new LinkedList<Integer>(a);
		for(int i=0;i<k;i++) {
			queue.add(queue.poll());
		}
		int[] list = queue.stream().mapToInt(i->i).toArray();
		for(int x=0;x<qry.length;x++) {
			qry[x]=list[qry[x]];
		}
		List<Integer> out = Arrays.stream(qry).boxed().collect(Collectors.toList());
		return out;
	}
    
}
