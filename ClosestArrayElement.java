import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClosestArrayElement {
    public static void main(String[] args) {
        int[] arr={15,3,9,1,7,2};
        int target=1;
        Set<Integer> LinkedSet=new LinkedHashSet<>();
        Set<Integer> Hset=new HashSet<>();
        TreeSet<Integer> Tset=new TreeSet<>();
        for(int i:arr)
        {
            Tset.add(i);
        }
        Integer lower=Tset.lower(target);
        Integer higher=Tset.higher(target);
        int res=0;
        if(lower==null)
        {
            res=higher;
            System.out.println(res);
        }
        else if(higher==null)
        {
            res=lower;
            System.out.println(res);
        }
        else
        {
            Integer diff1=target-lower;
            Integer diff2=higher-target;
            System.out.println(diff1>=diff2?higher:lower);
        }


    }
}
