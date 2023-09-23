public class DRoot {
    public int digitalRoot(int n) {

        int sum;

        // Converte int para String.
        String nStr = String.valueOf(n);

        // Converte String para char[].
        char[] nums = String.valueOf(n).toCharArray();

        // String testess = nums[0]
        ;
        // char[] teste =

        while (n > 9) {

            sum = 0;

            for (char num : nums) {

                // Converte String para int.
                int testeInt = Integer.parseInt(new StringBuilder().append(num).toString());

                // Converte char para int.
                testeInt = Character.getNumericValue(num);

                sum = sum + testeInt;
            }

            nums = (String.valueOf(n)).toCharArray();

            n = sum;
        }

        return n;
    }
}
