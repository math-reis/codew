public class Solution
{
    static void Main(string[] args)
    {
        char a = '?';
        char b = 'b';
        SameCase(a, b);
    }

    //Check same case: https://www.codewars.com/kata/5dd462a573ee6d0014ce715b
    public static int SameCase(char a, char b)
    {
        return char.IsLetter(a) & char.IsLetter(b) ? (char.IsUpper(a) == char.IsUpper(b) ? 1 : 0) : -1;
    }
}
    