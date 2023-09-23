public class MultiplesOf3or5 {
    public int solution(int number) {

        int result = 0;

        if (number < result)
            return result;

        for (int i = number - 1; i >= 0; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                result = result + i;
            }
        }

        return result;
    }
}
