public class Solution
{
    static void Main(string[] args)
    {
        long lalala = DigPow(46288, 3);

        Console.WriteLine(lalala);
    }

    #region 6 kyu
    //Playing with digits: https://www.codewars.com/kata/5552101f47fc5178b1000050
    public static long DigPow(int n, int p)
    {
        double result = 0;

        int x = 0; int y = 1;

        string number = n.ToString();
        
        while (y < n.ToString().Length + 1)
        {
            int sub = Convert.ToInt32(number.Substring(x, 1));

            double sum = 1;

            for (int i = 0; i < p; i++)
            {
                sum *= sub;               
            }

            result += sum;

            p++; x++; y++;
        }

        if (result % n == 0)
        {
            return Convert.ToInt32(result / n);
        }

        return -1;
    }

    //Counting Duplicates: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
    public static int DuplicateCount(string str)
    {
        str = str.ToUpper();

        int duplicate = 0;

        foreach (var letter in str)
        {
            str = str.Remove(0, 1);

            if (str.Contains(letter))
            {
                str = str.Replace(letter, ' ');
                duplicate++;
            }
        }

        return duplicate;
    }
    #endregion

    #region 7 kyu
    //Binary Addition: https://www.codewars.com/kata/551f37452ff852b7bd000139
    //public static string AddBinary(int a, int b)
    //{
    //    double sum = a + b;
    //    string binary = "";

    //    return binary;
    //}
    #endregion

    #region 8 kyu
    //Opposite number: https://www.codewars.com/kata/56dec885c54a926dcd001095
    public static int Opposite(int number)
    {
        return number > 0 ? number - (-2 * number) : number + (2 * number);
    }

    //DNA to RNA Conversion: https://www.codewars.com/kata/5556282156230d0e5e000089
    public static string DnaToRna(string dna)
    {
        return dna.Replace('T', 'U');
    }

    //Sum Arrays: https://www.codewars.com/kata/53dc54212259ed3d4f00071c
    public static double SumArray(double[] array)
    {
        double sum = 0;

        if (array == null)
        {
            return sum;
        }
        foreach (var item in array)
        {
            sum += item;
        }

        return sum;
    }

    //Cat years, Dog years: https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
    public static int[] humanYearsCatYearsDogYears(int humanYears)
    {
        int catYears = 0;
        int dogYears = 0;
        int baseYears = humanYears;

        if (humanYears >= 1)
        {
            catYears += 15;
            dogYears += 15;
            baseYears -= 1;
        }
        if (humanYears >= 2)
        {
            catYears += 9;
            dogYears += 9;
            baseYears -= 1;
        }

        catYears += (baseYears * 4);
        dogYears += (baseYears * 5);

        int[] result = { humanYears, catYears, dogYears };

        return result;
    }

    //Twice as old: https://www.codewars.com/kata/5b853229cfde412a470000d0
    public static int TwiceAsOld(int dadYears, int sonYears)
    {
        int result = dadYears - (sonYears * 2);

        if (result < 0)
        {
            result = (sonYears * 2) - dadYears;
        }

        return result;
    }

    //Total amount of points: https://www.codewars.com/kata/5bb904724c47249b10000131
    public static int TotalPoints(string[] games)
    {
        int points = 0;

        foreach (var game in games)
        {
            int x = Convert.ToInt32(game.Substring(0, 1));
            int y = Convert.ToInt32(game.Substring(2, 1));

            if (x > y)
            {
                points += 3;
            }
            else if (x == y)
            {
                points += 1;
            }
        }

        return points;
    }

    //Check same case: https://www.codewars.com/kata/5dd462a573ee6d0014ce715b
    public static int SameCase(char a, char b)
    {
        return char.IsLetter(a) & char.IsLetter(b) ? (char.IsUpper(a) == char.IsUpper(b) ? 1 : 0) : -1;
    }

    //Multiply: https://www.codewars.com/kata/50654ddff44f800200000004
    public static int Multiply(int a, int b)
    {
        return a * b;
    }
   #endregion
}
