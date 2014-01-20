package tv.ouya.console.api;

import android.os.Parcel;
import android.os.Parcelable;

public class UserInfo implements Parcelable
{
    public static final Parcelable.Creator<UserInfo> CREATOR = null;
    public UserInfo()
    {
    }
    public UserInfo( String username, String email, boolean founder )
    {
    }
    public UserInfo( String username, String email, boolean founder, String password, String password2, boolean emailOptOut )
    {
    }
    public String getEmail()
    {
        return null;
    }
    public UserInfo setEmail( String email )
    {
        return null;
    }
    public String getPassword2()
    {
        return null;
    }
    public UserInfo setPassword2( String password2 )
    {
        return null;
    }
    public String getPassword()
    {
        return null;
    }
    public UserInfo setPassword(String password)
    {
        return null;
    }
    public String getUsername()
    {
        return null;
    }
    public UserInfo setUsername( String username )
    {
        return null;
    }
    public boolean isFounder()
    {
        return false;
    }
    public boolean isEmailOptOut()
    {
        return false;
    }
    public void setEmailOptOut( boolean emailOptOut )
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
    public String toString()
    {
        return null;
    }
    public int describeContents()
    {
        return -1;
    }
    public void writeToParcel( Parcel parcel, int i )
    {
    }
}
