package tv.ouya.console.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class OuyaController
{
    public static final int BUTTON_O = 96;
    public static final int BUTTON_U = 99;
    public static final int BUTTON_Y = 100;
    public static final int BUTTON_A = 97;
    public static final int BUTTON_L1 = 102;
    @Deprecated
    public static final int BUTTON_L2 = 104;
    public static final int BUTTON_R1 = 103;
    @Deprecated
    public static final int BUTTON_R2 = 105;
    public static final int BUTTON_MENU = 82;
    public static final int AXIS_LS_X = 0;
    public static final int AXIS_LS_Y = 1;
    public static final int AXIS_RS_X = 11;
    public static final int AXIS_RS_Y = 14;
    public static final int AXIS_L2 = 17;
    public static final int AXIS_R2 = 18;
    public static final int BUTTON_DPAD_UP = 19;
    public static final int BUTTON_DPAD_RIGHT = 22;
    public static final int BUTTON_DPAD_DOWN = 20;
    public static final int BUTTON_DPAD_LEFT = 21;
    public static final int BUTTON_R3 = 107;
    public static final int BUTTON_L3 = 106;
    public static final int MAX_CONTROLLERS = 4;
    public static final float STICK_DEADZONE = 0.25F;
    public OuyaController( int deviceId )
    {
    }
    public static void init( Context context )
    {
    }
    public static OuyaController getControllerByDeviceId( int deviceId )
    {
        return null;
    }
    public static int getPlayerNumByDeviceId( int deviceId )
    {
        return -1;
    }
    public static OuyaController getControllerByPlayer( int playerNum )
    {
        return null;
    }
    public static boolean onGenericMotionEvent( MotionEvent event )
    {
        return false;
    }
    public static boolean onKeyDown( int keyCode, KeyEvent event )
    {
        return false;
    }
    public static boolean onKeyUp( int keyCode, KeyEvent event )
    {
        return false;
    }
    public static void startOfFrame()
    {
    }
    public static void showCursor( boolean showCursor )
    {
    }
    public static void setCursorBitmap( Bitmap bitmap, float hotSpotX, float hotSpotY )
    {
    }
    public boolean buttonChangedThisFrame(int ouyaButton)
    {
        return false;
    }
    public boolean buttonPressedThisFrame( int ouyaButton )
    {
        return false;
    }
    public boolean buttonReleasedThisFrame( int ouyaButton )
    {
        return false;
    }
    public InputDevice getDevice()
    {
        return null;
    }
    public int getDeviceId()
    {
        return -1;
    }
    public float getAxisValue( int ouyaAxis )
    {
        return 0;
    }
    public boolean getButton( int ouyaButton )
    {
        return false;
    }
    public int getPlayerNum()
    {
        return -1;
    }
}
