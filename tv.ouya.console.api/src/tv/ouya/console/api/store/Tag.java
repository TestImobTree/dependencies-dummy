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
