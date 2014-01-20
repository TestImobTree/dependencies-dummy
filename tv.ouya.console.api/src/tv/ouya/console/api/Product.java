package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class Product implements Parcelable
{
    public static final int CURRENT_PRODUCT_VERSION = -1;
    public static final int INITIAL_PRODUCT_VERSION = -1;
    public static final Parcelable.Creator<Product> CREATOR = null;
    public Product()
    {
    }
    public Product( JSONObject object ) throws JSONException
    {
    }
    public Product( String identifier, String name, int priceInCents, double localPrice, String currencyCode, double originalPrice, double percentOff, String description )
    {
    }
    public String getIdentifier()
    {
        return null;
    }
    public String getName()
    {
        return null;
    }
    @Deprecated
    public int getPriceInCents()
    {
        return -1;
    }
    public double getLocalPrice()
    {
        return -1;
    }
    public double getOriginalPrice()
    {
        return -1;
    }
    public double getPercentOff()
    {
        return -1;
    }
    public String getCurrencyCode()
    {
        return null;
    }
    public String getFormattedPrice()
    {
        return null;
    }
    public String getDescription()
    {
        return null;
    }
    public void setCurrencyCode( String currencyCode )
    {
    }
    public void setProductVersionToBundle( int productVersionToBundle )
    {
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
    public void readFromJSONObject( JSONObject object ) throws JSONException
    {
    }
}
