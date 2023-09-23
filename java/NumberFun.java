public class NumberFun {
    public long findNextSquare(long sq) {

        if (Math.sqrt(sq) % 1 != 0) {
            return -1;
        }

        do {
            sq++;
        } while (Math.sqrt(sq) % 1 != 0);

        return sq;
    }

}
