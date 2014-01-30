/**
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
 * Authors: littleguy77
 */
package com.bda.controller;

import android.content.Context;
import android.os.Handler;

public class Controller
{
    private Controller()
    {
    }
    
    public static final Controller getInstance( Context context )
    {
        return new Controller();
    }
    
    public final boolean init()
    {
        return true;
    }
    
    public final void setListener( ControllerListener listener, Handler handler )
    {
    }
    
    public final void onPause()
    {
    }
    
    public final void onResume()
    {
    }
    
    public final void exit()
    {
    }
}
