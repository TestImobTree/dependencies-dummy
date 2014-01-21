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

import android.os.Bundle;
import java.util.Map;

public abstract class JsonResponseListener<T>
{
    public abstract void onSuccess( T paramT );
    public abstract void onFailure( int paramInt, String paramString, Bundle paramBundle );
    public abstract void onCancel();
    public final void onFailure( int errorCode, String errorMessage )
    {
    }
    public final void onFailure( int errorCode, String errorMessage, Map<String, String[]> optionalData )
    {
    }
    protected Bundle packageAsBundle( Map<String, String[]> map )
    {
        return null;
    }
}
