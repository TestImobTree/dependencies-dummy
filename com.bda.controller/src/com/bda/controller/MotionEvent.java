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

public class MotionEvent
{
    public static final int ACTION_DOWN = 0;
    public static final int AXIS_LTRIGGER = 0;
    public static final int AXIS_RTRIGGER = 0;
    public static final int AXIS_X = 0;
    public static final int AXIS_Y = 0;
    public static final int AXIS_Z = 0;
    public static final int AXIS_RZ = 0;
    
    public float getAxisValue( int axis )
    {
        return 0;
    }
    
    public int getControllerId()
    {
        return 0;
    }
}
