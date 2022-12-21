public class OddOccurrencesInArray {
    public int solution(int[] A){
        //step one: loop through the array
        for(int i = 0; i < A.length; i++){
            //step two: continue if element is a zero, mark pair as false
            if (A[i] == 0) continue;
            boolean pair = false;
            //step three: check if there's another equal element as you loop through the array
            for(int j = i+1; j < A.length; j++){
                //step four: if there's an equal, make both elements zeros and mark pair as true
                if (A[i] == A[j]){
                    A[i] = A[j] = 0;
                    pair = true;
                }
            }
            //if pair is not true, return element
            if (!pair){
                return A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args){
        OddOccurrencesInArray obj = new OddOccurrencesInArray();

        int[] A = {9,3,9,3,9,7,9};

        System.out.println(obj.solution(A));
    }
}
