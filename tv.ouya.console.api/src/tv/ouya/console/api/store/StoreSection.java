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
