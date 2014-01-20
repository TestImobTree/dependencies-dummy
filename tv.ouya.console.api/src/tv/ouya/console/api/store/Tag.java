package tv.ouya.console.api.store;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class Tag implements Parcelable
{
    public static final Parcelable.Creator<Tag> CREATOR = null;
    public Boolean adminOnly;
    public Tag()
    {
    }
    public Tag( JSONObject object ) throws JSONException
    {
    }
    public Tag( String name, Boolean adminOnly, String imageUrl )
    {
    }
    public String getName()
    {
        return null;
    }
    public void setName( String name )
    {
    }
    public String getImageUrl()
    {
        return null;
    }
    public boolean equals( Object o )
    {
        return false;
    }
    public int hashCode()
    {
        return -1;
    }
    public int describeContents()
    {
        return -1;
    }
    public void writeToParcel( Parcel parcel, int i )
    {
    }
    public void readFromJSON( JSONObject object ) throws JSONException
    {
    }
}
