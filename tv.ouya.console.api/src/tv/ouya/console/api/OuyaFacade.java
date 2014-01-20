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
