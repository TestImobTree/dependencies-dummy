package tv.ouya.console.api;

public class GamerIdentity
{
    private static GamerIdentity sGamerIdentity = null;
    public static GamerIdentity getInstance()
    {
        return sGamerIdentity;
    }
    @Deprecated
    public static void setInstance( GamerIdentity instance )
    {
    }
    public void setGamerToken( String token )
    {
    }
    public String getGamerToken()
    {
        return null;
    }
}
