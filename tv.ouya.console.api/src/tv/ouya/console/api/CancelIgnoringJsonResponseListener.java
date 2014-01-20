package tv.ouya.console.api;

import android.os.Bundle;

public abstract class CancelIgnoringJsonResponseListener<T> extends JsonResponseListener<T>
{
    public abstract void onSuccess( T paramT );
    public abstract void onFailure( int paramInt, String paramString, Bundle paramBundle );
    public void onCancel()
    {
    }
}
