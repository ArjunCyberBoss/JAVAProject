
package Utilities;

public class AgeIncorrectException extends RuntimeException
{
    @Override
    public String getLocalizedMessage()
    {
        return "Invalid age group!\n(Donor must be above 18)";
    }
}
