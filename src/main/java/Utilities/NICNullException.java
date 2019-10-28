
package Utilities;

public class NICNullException extends RuntimeException
{
    @Override
    public String getLocalizedMessage ()
    {
        return "N. I. C. section can't be empty!";
    }
}
