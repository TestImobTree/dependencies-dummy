package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

public class Receipt implements Parcelable
{
    public static final Parcelable.Creator<Receipt> CREATOR = null;
    public Receipt()
    {
    }
    public Receipt( String identifier, int priceInCents, Date purchaseDate, Date generatedDate, String gamerUuid, String uuid, double localPrice, String currency )
    {
    }
    public String getIdentifier()
    {
        return null;
    }
    @Deprecated
    public int getPriceInCents()
    {
        return -1;
    }
    public Date getPurchaseDate()
    {
        return null;
    }
    public String getGamer()
    {
        return null;
    }
    public double getLocalPrice()
    {
        return -1;
    }
    public String getCurrency()
    {
        return null;
    }
    public String getFormattedPrice()
    {
        return null;
    }
    public String getUuid()
    {
        return null;
    }
    public void setIdentifier( String identifier )
    {
    }
    public void setPriceInCents( int priceInCents )
    {
    }
    public void setPurchaseDate( Date purchaseDate )
    {
    }
    public void setDate( String date )
    {
    }
    public Date getGeneratedDate()
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