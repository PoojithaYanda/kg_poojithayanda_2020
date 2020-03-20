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
           int index;
           // stores the result after mapping the first and second strings by considering the ascii values
           int[] mapping = new int[128];
           // Converting all the characters in first string to lower case
           firstString = firstString.toLowerCase();
           // Converting all the characters in second string to lower case
           secondString = secondString.toLowerCase();
            for(int i=0;i<128;i++)
            {
                mapping[i]=0; //initializing all the values to zero
            }
            for(int j=0;j<firstString.length();j++)
            {
                char ch1=firstString.charAt(j); //considering the first string character as ch1 at jth position.
                char ch2=secondString.charAt(j); //considering the second string character as ch2 at jth position.
                index = (int) ch1; // casting the ch1 to index so that the value is stored in the Mapping array at index.

                if(mapping[index]==0)
                {
                    // if the value at index is zero then assign ch2 in index position and continue.
                    mapping[index]=ch2;
                }
                else
                {
                    // if the value at index is not zero then verify whether the repetitive characters has the same value.
                    char ch3= (char)mapping[index];
                    if(ch3!=ch2)
                    {
                        return false;
                    }
                }
            }
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
