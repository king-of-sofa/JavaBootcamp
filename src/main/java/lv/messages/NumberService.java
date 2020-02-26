package lv.messages;

public class NumberService {
    public int rangeSum(int start, int finish) {

        if(start > finish){
            int tempValue = start;
            start = finish;
            finish = tempValue;
        }

        int sum = 0;
        for (int i=start; i<=finish; i++) sum += i;

        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        if(start > finish){
            int tempValue = start;
            start = finish;
            finish = tempValue;
        }
        int oddCount = 0;
        for (int i=start; i<=finish; i++){
            if(i % 2 == 0){
                oddCount++;
            }
        }

        return oddCount;
    }



}
