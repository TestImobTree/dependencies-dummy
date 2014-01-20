package tv.ouya.console.api;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.text.ParseException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OuyaEncryptionHelper
{
    public List<Receipt> decryptReceiptResponse( JSONObject encryptedResponse, PublicKey appKey ) throws GeneralSecurityException, IOException, JSONException, ParseException
    {
        return null;
    }
    public String decryptPurchaseResponse( JSONObject encryptedResponse, PublicKey appKey ) throws GeneralSecurityException, IOException, JSONException, ParseException
    {
        return null;
    }
    public List<Receipt> parseJSONReceiptResponse( String receiptResponse ) throws IOException
    {
        return null;
    }
    public List<Receipt> parseJSONReceiptResponse( JSONArray receiptArray ) throws JSONException, ParseException
    {
        return null;
    }
    public static Product decryptProductResponse( String encryptedResponse, byte[] appKey ) throws GeneralSecurityException, IOException, JSONException
    {
        return null;
    }
}
