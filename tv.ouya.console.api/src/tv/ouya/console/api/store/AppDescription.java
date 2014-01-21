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

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class AppDescription implements Parcelable
{
    public static final Parcelable.Creator<AppDescription> CREATOR = null;
    public AppDescription()
    {
    }
    public AppDescription( JSONObject object ) throws JSONException
    {
    }
    public AppDescription( String uuid, String title, HashMap<String, AppVersion> versions )
    {
    }
    public AppDescription( String uuid, String title, String imageUrl, double percentOff, HashMap<String, AppVersion> versions )
    {
    }
    public String getTitle()
    {
        return null;
    }
    public void setTitle( String title )
    {
    }
    public String getUuid()
    {
        return null;
    }
    public void setUuid( String uuid )
    {
    }
    public HashMap<String, AppVersion> getVersions()
    {
        return null;
    }
    public void setVersions( HashMap<String, AppVersion> versions )
    {
    }
    public String getImageUrl()
    {
        return null;
    }
    public void setMainImageFullUrl( String mainImageFullUrl )
    {
    }
    public double getPercentOff()
    {
        return -1;
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
    public String toString()
    {
        return null;
    }
    public void readFromJSON( JSONObject object ) throws JSONException
    {
    }
    public String getMostRecentVersionUuid()
    {
        return null;
    }
    public String getMostRecentVersionUploadedAt()
    {
        return null;
    }
    public String getMostRecentVersionMainImageFullUrl()
    {
        return null;
    }
    public String getMostRecentVersionContentRating()
    {
        return null;
    }
    public Intent getLaunchIntent( Context context )
    {
        return null;
    }
    public static class AppVersion
    {
        public static final AppVersion EMPTY_VERSION = null;
        public AppVersion()
        {
        }
        public AppVersion( JSONObject object ) throws JSONException
        {
        }
        public String getUuid()
        {
            return null;
        }
        public void setUuid( String uuid )
        {
        }
        public String getUploadedAt()
        {
            return null;
        }
        public Date getUploadedAtDate()
        {
            return null;
        }
        public void setUploadedAt( String uploadedAt )
        {
        }
        public String getMainImageFullUrl()
        {
            return null;
        }
        public void setMainImageFullUrl( String mainImageFullUrl )
        {
        }
        public String getContentRating()
        {
            return null;
        }
        public void setContentRating( String contentRating )
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
        public void readFromJSON( JSONObject object ) throws JSONException
        {
        }
    }
}
