package tv.ouya.console.api;

import android.app.Activity;
import android.os.Bundle;

public class OuyaAuthenticationHelper
{
    public static final String OUYA_ACCOUNT_TYPE = null;
    public static boolean handleError( Activity activity, int errorCode, String errorMessage, Bundle bundle, int authActivityId, OuyaResponseListener<Void> listener )
    {
        return false;
    }
}
