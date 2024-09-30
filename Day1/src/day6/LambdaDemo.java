package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

    public boolean operateOnNum(Predicate p, int n) {
        return p.test(n);
    }

    public List<Integer> operateOnNum(Predicate p, List<Integer> n) {
        List<Integer> filtered = new ArrayList<>();
        for(Integer i : n) {
            if (p.test(i)) {
                filtered.add(i);
            }
        }
        return  filtered;
    }

    public String operateOnString(Uppercase u, String str) {
        return u.apply(str);
    }

    public static void main(String[] args) {
        Predicate iseven = (n) -> n%2 == 0;
        System.out.println(iseven.test(13));

        Predicate isprime = (n) -> {
          for (int i =2; i<n ; i++) {
              if(n%i==0)
                  return false;
          }
          return true;
        };

        System.out.println(isprime.test(13));

        LambdaDemo lambda = new LambdaDemo();
        boolean ispositive = lambda.operateOnNum((n) -> n>0, 12);
        System.out.println(ispositive);

        Integer [] nums = {12, -13, 14, -15, -16, 17, 18, 1800, 1000, 400, -500};
        List<Integer> vals = Arrays.asList(nums);
        List<Integer> positives = lambda.operateOnNum((n) -> n>0, vals);
        System.out.println(positives);
        List<Integer> multiplesOf100 = lambda.operateOnNum((n) -> n%100==0, vals);
        System.out.println(multiplesOf100);


        System.out.println(lambda.operateOnString((n) -> n.toUpperCase(), "Hello"));
        System.out.println(lambda.operateOnString((n) -> {
            String rev = "";
            for (int i=n.length()-1;i>=0;i--)
            {
                rev = rev+n.charAt(i);
            }
            return rev;
        }, "Hello"));
        String upper = lambda.operateOnString(String::toUpperCase, "Lambda");
        System.out.println(upper);
        String reverse = lambda.operateOnString(GenericLambda::reverse, "Lambda");
        System.out.println(reverse);

    }
}
