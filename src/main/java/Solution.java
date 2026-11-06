public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (!(x.length() < 2)) {
        String xsolution = x.substring(x.length() - 2);
        return ((xsolution.equals("ly")));
     }
        return false;
    }

    public String conCat(String s1, String s2) {
        if (!(s1.equals("")) && !(s2.equals(""))) {
        String s1solution = s1.substring(s1.length() - 1);
        String s2solution = s2.substring(0,1);
        if ((s1solution.equals(s2solution))) {
            s2 = s2.substring(1,s2.length());
        }
    }
        return s1 + s2;
    }

    public String withoutX(String s1) {
        String s1solution = s1.substring(0,1);
        if (s1solution.equals("x")) {
            s1 = s1.substring(1,s1.length());
        }
        String s1solution2 = s1.substring(s1.length() - 1);
        if (s1solution2.equals("x")) {
            s1 = s1.substring(0,(s1.length() - 1));
        }
        return s1;
    }

    public String fizzString(String s1) {
        String solution = "";
        String fsolution = s1.substring(0,1);
        String bsolution = s1.substring(s1.length() - 1);
        if (fsolution.equals("f")) {
            solution = "Fizz";
            if (bsolution.equals("b")) {
                solution = "FizzBuzz";
            }
        } else if (bsolution.equals("b")) {
            solution = "Buzz";
        }
        return solution;
    }

    public String fizzString2(int x) {
        String solution = (x + "!");
        if (x % 3 == 0) {
            solution = "Fizz!";
            if (x % 5 == 0) {
                solution = "FizzBuzz!";
            }
        } else if (x % 5 == 0) {
            solution = "Buzz!";
        }
        return solution;
    }

}
