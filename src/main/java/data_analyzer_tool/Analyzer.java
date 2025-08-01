package data_analyzer_tool;
import java.util.ArrayList;

public class Analyzer <T> {

   public ArrayList<T> myList;

   public Analyzer(ArrayList<T> myList){
       this.myList = myList;
   }

   public void analyze(T... numbers) {
        for (T num : numbers) {
            myList.add(num);
        }
    }

    public int countEven(ArrayList<Integer> myList) {

        int count = 0;
        for (int num : myList) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOdd(ArrayList<Integer> myList) {

        int count = 0;
        for (int num : myList) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int countDiv3(ArrayList<Integer> myList) {

        int count = 0;
        for (int num : myList) {
            if (num % 3 == 0) {
                count++;
            }
        }
        return count;
    }

}





