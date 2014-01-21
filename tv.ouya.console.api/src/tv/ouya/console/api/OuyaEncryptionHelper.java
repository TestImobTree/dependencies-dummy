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
