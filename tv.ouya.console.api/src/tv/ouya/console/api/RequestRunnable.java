package tv.ouya.console.api;

import android.os.RemoteException;

public abstract class RequestRunnable<T> implements Runnable
{
    protected OuyaResponseListener<T> listener;
    public RequestRunnable( OuyaResponseListener<T> listener, String target )
    {
    }
    public void run()
    {
    }
    public abstract void doRun() throws RemoteException;
}
