package tv.ouya.console.api.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class StoreSection implements Parcelable
{
    public StoreSection()
    {
    }
    public static enum Type
    {
        TAG, LIST;
        private Type(){
        }
    }
    public static final Parcelable.Creator<StoreSection> CREATOR = null;
    public StoreSection( JSONObject object ) throws JSONException
    {
    }
    public StoreSection( String name, String type, List<StoreSection> subsections )
    {
    }
    public String getName()
    {
        return null;
    }
    public void setName( String name )
    {
    }
    public Type getType()
    {
        return null;
    }
    public void setType( Type type )
    {
    }
    public List<StoreSection> getSubsections()
    {
        return null;
    }
    public void setSubsections(List<StoreSection> subsections)
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
    public int describeContents()
    {
        return -1;
    }
    public void writeToParcel( Parcel parcel, int flags )
    {
    }
    public void readFromJSON( JSONObject object ) throws JSONException
    {
    }
}
