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
import tv.ouya.console.api.Product;

public final class AppDetails implements Parcelable
{
    public static final Parcelable.Creator<AppDetails> CREATOR = null;
    public String title;
    public String description;
    public String mainImageFullUrl;
    public String uuid;
    public Long apkFileSize;
    public String versionNumber;
    public String publishedAt;
    public List<String> imageUrls;
    public Long likeCount;
    public String overview;
    public String rating;
    public String latestVersion;
    public boolean founder;
    public String developer;
    public String videoUrl;
    public Product primaryProduct;
    public AppDetails()
    {
    }
    public AppDetails( JSONObject object ) throws JSONException
    {
        readFromJSON( object );
    }
    public AppDetails( String title, String description, String mainImageFullUrl, String uuid, Long apkFileSize, String versionNumber, String publishedAt, List<String> imageUrls, Long likeCount, String overview, String rating, String latestVersion, Boolean founder, String developer, String videoUrl, Product primaryProduct )
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
    public void writeToParcel( Parcel parcel, int i )
    {
    }
    public void readFromJSON( JSONObject object ) throws JSONException
    {
    }
    public AppDescription getDescription( String appUuid )
    {
        return null;
    }
}
