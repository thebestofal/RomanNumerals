
public class RomanNumeral
{
    int number;
    String roman = "";
    public RomanNumeral(int number)
    {
        this.number = number;
        int length = String.valueOf(number).length();
        if(number < 100000)
        {
                int last_number = number % 10;
                number = number/10;
                if(number < 2)
                    roman = "I".repeat(number);
                else if(number < 4)
                    roman += "X".repeat(number);
                else if(number == 4)
                    roman += "XL";
                else if(number == 5)
                    roman += "L";
                if(last_number == 5)
                    roman += "V";
                else if(last_number < 5)
                {
                    if(last_number == 4)
                        roman += "IV";
                    else
                        roman += "I".repeat(last_number);
                }
                else if(last_number > 5)
                {
                    if(last_number == 9)
                        roman += "IX";
                    else
                        roman += "V"+"I".repeat(last_number%5);
                }
        }
    }
    
    public String getRomanNumeral()
    {
        return roman;
    }
}
