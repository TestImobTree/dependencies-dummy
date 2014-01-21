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
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import tv.ouya.console.api.Purchasable;

public abstract interface IIapServiceDefinition extends IInterface
{
    public abstract void setTestMode() throws RemoteException;
    public abstract void requestProductList( String paramString, List<Purchasable> paramList, IProductListListener paramIProductListListener ) throws RemoteException;
    public abstract void requestPurchase( String paramString, Purchasable paramPurchasable, IStringListener paramIStringListener ) throws RemoteException;
    public abstract void requestReceipts( String paramString, IStringListener paramIStringListener ) throws RemoteException;
    public abstract void requestGamerUuid( String paramString, IStringListener paramIStringListener ) throws RemoteException;
    public abstract void requestProductListForVersion( String paramString, int paramInt, List<Purchasable> paramList, IProductListListener paramIProductListListener ) throws RemoteException;
    public abstract void requestGamerInfo( String paramString, IStringListener paramIStringListener ) throws RemoteException;
    public static abstract class Stub extends Binder implements IIapServiceDefinition
    {
        public static final int TRANSACTION_setTestMode = 1;
        public static final int TRANSACTION_requestProductList = 2;
        public static final int TRANSACTION_requestPurchase = 3;
        public static final int TRANSACTION_requestReceipts = 4;
        public static final int TRANSACTION_requestGamerUuid = 5;
        public static final int TRANSACTION_requestProductListForVersion = 6;
        public static final int TRANSACTION_requestGamerInfo = 7;
        public Stub()
        {
        }
        public static IIapServiceDefinition asInterface( IBinder obj )
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
