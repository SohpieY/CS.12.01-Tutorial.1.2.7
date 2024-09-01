import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<>();

        if(num < 0){
            throw new IllegalArgumentException("The number passed to the constructor (" +num+ ") cannot be negative!");
        }

        String numString = String.valueOf(num);

        for(int i = 0; i < numString.length(); i++){
            char currentChar = numString.charAt(i);
            digitList.add(Integer.parseInt(String.valueOf(currentChar)));
        }




    }


    public boolean isStrictlyIncreasing() {

        // Check list size
        //Interate through the list
        //compare elements, For each element, compare it to the previous element:
        //If any element is not greater than the preceding element, return false.

        for(int i = 1; i < digitList.size(); i++){
            if(digitList.get(i) <= digitList.get(i-1)) return false;
        }
        return true;

    }
    public ArrayList<Integer> getDigitList(){
        return digitList;
    }


}
