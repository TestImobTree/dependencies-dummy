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
import org.json.JSONException;
import org.json.JSONObject;

public class CreditCardInfo implements Parcelable
{
    public static final Parcelable.Creator<CreditCardInfo> CREATOR = null;
    public CreditCardInfo()
    {
    }
    public CreditCardInfo( JSONObject object ) throws JSONException
    {
    }
    public CreditCardInfo( double balance, String lastFourDigits, String provider, String expiresAt, String currencyCode )
    {
    }
    public double getBalance()
    {
        return -1;
    }
    public String getLastFourDigits()
    {
        return null;
    }
    public String getProvider()
    {
        return null;
    }
    public String getExpiresAt()
    {
        return null;
    }
    public String getCurrencyCode()
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
