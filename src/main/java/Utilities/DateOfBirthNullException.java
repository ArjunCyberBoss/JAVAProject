
package Utilities;

public class DateOfBirthNullException extends RuntimeException
{
    @Override
    public String getLocalizedMessage ()
    {
        return "Date Of Birth section can't be empty!";
    }
}
