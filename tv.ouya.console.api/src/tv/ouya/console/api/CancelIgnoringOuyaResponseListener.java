package tv.ouya.console.api;

public abstract class CancelIgnoringOuyaResponseListener<T> implements OuyaResponseListener<T>
{
    public final void onCancel()
    {
    }
}
