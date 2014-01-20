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
