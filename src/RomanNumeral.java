
public class RomanNumeral
{
    int number;
    String roman = "";
    
    void threeDigits(int number)
    {
        int first_number = number/100;
        if(first_number <= 3)
            roman += "C".repeat(first_number);
        else if(first_number == 4)
            roman += "CD";
        else if(first_number == 5)
            roman += "D";
        else if(first_number >= 6 && first_number<=8)
            roman += "D"+"C".repeat(first_number%5);
        else if(first_number == 9)
            roman += "CM";
        number %= 100;
        oneAndTwoDigits(number);
    }
    void oneAndTwoDigits(int number)
    {
        int last_number = number % 10;
        number = number/10;
        if(number < 4)
            roman += "X".repeat(number);
        else if(number == 4)
            roman += "XL";
        else if(number == 5)
            roman += "L";
        else if(number >= 6 && number <= 8)
            roman += "L"+"X".repeat(number%5);
        else if(number == 9)
            roman += "XC";
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
    public RomanNumeral(int number)
    {
        this.number = number;
        int length = String.valueOf(number).length();
        if(length == 4)
        {
            int first_number = number/1000;
            if(first_number < 3)
                roman += "M".repeat(first_number);
            number %= 1000;
            threeDigits(number);
        }
        else if(length == 3)
        {
            threeDigits(number);
        }
        else if(length < 3)
        {
            oneAndTwoDigits(number);
        }
    }
    
    public String getRomanNumeral()
    {
        return roman;
    }
}
