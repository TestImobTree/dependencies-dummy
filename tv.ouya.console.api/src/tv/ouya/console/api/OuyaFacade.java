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

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tv.ouya.console.internal.IIapServiceDefinition;

public class OuyaFacade
{
    public static final int ODK_VERSION_NUMBER = -1;
    private static OuyaFacade sOuyaFacade = null;
    public OuyaFacade()
    {
    }
    public static OuyaFacade getInstance()
    {
        if( sOuyaFacade == null ) {
            sOuyaFacade = new OuyaFacade();
        }
        return sOuyaFacade;
    }
    public static int getOdkVersionNumber()
    {
        return -1;
    }
    @Deprecated
    public static void setInstance( OuyaFacade instance )
    {
    }
    public void init( Context context, String developerId )
    {
    }
    public void shutdown()
    {
    }
    public boolean isInitialized()
    {
      return false;
    }
    public boolean isRunningOnOUYAHardware()
    {
        return false;
    }
    public void setTestMode()
    {
    }
    public void putGameData( String name, String value )
    {
    }
    public String getGameData( String name )
    {
        return null;
    }
    public Map<String, String> getAllGameData()
    {
        return null;
    }
    public void requestProductList( List<Purchasable> purchasables, OuyaResponseListener<ArrayList<Product>> productListListener)
    {
    }
    public void requestPurchase( Purchasable purchasable, OuyaResponseListener<String> purchaseListener )
    {
    }
    public void requestReceipts( OuyaResponseListener<String> receiptListListener )
    {
    }
    @Deprecated
    public void requestGamerUuid(OuyaResponseListener<String> gamerUuidListener)
    {
    }
    public void requestGamerInfo( OuyaResponseListener<GamerInfo> gamerInfoListener )
    {
    }
    @Deprecated
    IIapServiceDefinition getRemoteService()
    {
        return null;
    }
    @Deprecated
    public boolean bindRequestHasBeenMade()
    {
        return false;
    }
    public void onServiceConnected( ComponentName componentName, IBinder iBinder )
    {
    }
    public void onServiceDisconnected( ComponentName componentName )
    {
    }
    public void ensureServiceIsBound()
    {
    }
}
