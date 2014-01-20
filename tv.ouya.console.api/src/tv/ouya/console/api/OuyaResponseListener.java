package tv.ouya.console.api;

public interface OuyaResponseListener<T extends Object>
{
    public void onFailure();
    public void onSuccess();
}
