public class WhoLikesIt {
    public String whoLikesIt(String... names) {

        if (names.length == 0) {
            return "no one likes this";
        }
        if (names.length == 1) {
            return String.format("%1$s likes this", names[0]);
        }
        if (names.length == 2) {
            return String.format("%1$s and %2$s like this", names[0], names[1]);
        }
        if (names.length == 3) {
            return String.format("%1$s, %2$s and %3$s like this", names[0], names[1], names[2]);
        }

        return String.format("%1$s, %2$s and %3$s others like this", names[0], names[1], names.length - 2);
    }
}
