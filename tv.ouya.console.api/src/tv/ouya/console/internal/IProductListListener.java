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
package tv.ouya.console.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import tv.ouya.console.api.Product;

public abstract interface IProductListListener extends IInterface
{
    public abstract void onSuccess( List<Product> paramList ) throws RemoteException;
    public abstract void onFailure( int paramInt, String paramString, Bundle paramBundle ) throws RemoteException;
    public abstract void onCancel() throws RemoteException;
    public static abstract class Stub extends Binder implements IProductListListener
    {
        public static final int TRANSACTION_onSuccess = 1;
        public static final int TRANSACTION_onFailure = 2;
        public static final int TRANSACTION_onCancel = 3;
        public Stub()
        {
        }
        public static IProductListListener asInterface( IBinder obj )
        {
            return null;
        }
        public IBinder asBinder()
        {
            return null;
        }
        public boolean onTransact( int code, Parcel data, Parcel reply, int flags ) throws RemoteException
        {
            return false;
        }
    }
}
