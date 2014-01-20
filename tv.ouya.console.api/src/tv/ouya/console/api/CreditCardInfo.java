package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class CreditCardInfo implements Parcelable
{
    public static final Parcelable.Creator<CreditCardInfo> CREATOR = null;
    public CreditCardInfo()
    {
    }
    public CreditCardInfo( JSONObject object ) throws JSONException
    {
    }
    public CreditCardInfo( double balance, String lastFourDigits, String provider, String expiresAt, String currencyCode )
    {
    }
    public double getBalance()
    {
        return -1;
    }
    public String getLastFourDigits()
    {
        return null;
    }
    public String getProvider()
    {
        return null;
    }
    public String getExpiresAt()
    {
        return null;
    }
    public String getCurrencyCode()
    {
        return null;
    }
    public int describeContents()
    {
        return -1;
    }
    public void writeToParcel( Parcel dest, int flags )
    {
    }
    public boolean equals( Object o )
    {
        return false;
    }
    public int hashCode()
    {
        return -1;
    }
}
