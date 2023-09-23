public class FindOdd {
    public static int findIt(int[] a) {

        int oddOcc = 0;
        int oddReturn = 0;

        for (int i = 0; i < a.length; i++) {
            for (int b : a) {
                if (a[i] == b) {
                    oddOcc++;
                }
            }
            if (oddOcc % 2 != 0) {
                oddReturn = a[i];
                break;
            }
        }

        return oddReturn;
    }
}
