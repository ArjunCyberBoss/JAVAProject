
package Utilities;

public class NameNullException extends RuntimeException
{
    @Override
    public String getLocalizedMessage ()
    {
        return "Invalid name!\n (Name section can't be empty)";
    }
}
