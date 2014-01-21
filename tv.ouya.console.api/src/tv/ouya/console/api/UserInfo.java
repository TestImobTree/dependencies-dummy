/*******************************************************************************
 * dependencies-dummy
 * 
 * Copyright (C) 2013 Paul Lamb
 * 
 * This file is part of dependencies-dummy.
 * 
 * Mupen64PlusAE is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * Mupen64PlusAE is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with Mupen64PlusAE. If
 * not, see <http://www.gnu.org/licenses/>.
 * 
 * Authors: Paul Lamb
 ******************************************************************************/
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
