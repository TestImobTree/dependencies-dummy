package tv.ouya.console.api;

import android.os.Bundle;
import java.util.Map;

public abstract class JsonResponseListener<T>
{
    public abstract void onSuccess( T paramT );
    public abstract void onFailure( int paramInt, String paramString, Bundle paramBundle );
    public abstract void onCancel();
    public final void onFailure( int errorCode, String errorMessage )
    {
    }
    public final void onFailure( int errorCode, String errorMessage, Map<String, String[]> optionalData )
    {
    }
    protected Bundle packageAsBundle( Map<String, String[]> map )
    {
        return null;
    }
}
