/**
 * Description: This class determines whether a one-to-one character mapping exists from
 * one string, s1, to another string, s2.
 * Author: Poojitha Yanda
 */

class Main
{
    public static boolean mapCharacters(String firstString,String secondString)
    {
        if(firstString.length()!=secondString.length())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String args[])
    {
        if(args.length!=2)
        {
            System.out.println("Please provide two inputs. Example: java Main <first> <second>");
            return;
        }
        boolean result = mapCharacters(args[0],args[1]);
        System.out.println(result);
    }
}
