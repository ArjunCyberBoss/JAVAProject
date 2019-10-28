
package Utilities;

public class GenderNullException extends RuntimeException
{
    @Override
    public String getLocalizedMessage()
    {
        return "Please select appropriate gender category!";
    }
}
