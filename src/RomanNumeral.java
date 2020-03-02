
public class RomanNumeral
{
    int number;
    String roman = "";
    void smallnumber(int number)
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
        if(number >= 100)
        {
            int first_number = number/100;
            if(first_number <= 3)
                roman += "C".repeat(first_number);
            else if(first_number == 4)
                roman += "CD";
            else if(first_number == 5)
                roman += "D";
            number %= 100;
            smallnumber(number);
        }
        else if(number < 100)
        {
            smallnumber(number);
        }
    }
    
    public String getRomanNumeral()
    {
        return roman;
    }
}
