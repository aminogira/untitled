import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class HR_One {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
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
