package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;

public class Purchasable implements Parcelable
{
    public static final Parcelable.Creator<Purchasable> CREATOR = null;
    public String getProductId()
    {
        return null;
    }
    public Purchasable( String productId )
    {
    }
    public Purchasable( String productId, String key, String iv, String payload )
    {
    }
    public int describeContents()
    {
        return -1;
    }
    public void writeToParcel( Parcel dest, int flags )
    {
    }
    public boolean hasEncryptionParameters()
    {
        return false;
    }
    public boolean equals( Object o )
    {
        return false;
    }
    public int hashCode()
    {
        return -1;
    }
    public String toJSON()
    {
        return null;
    }
}
