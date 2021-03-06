/*
 * <!--  Copyright (C) 2014 Alexander "Evisceration" Martinz
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * -->
 */

package alex.playground.utils;

import android.util.Log;

/**
 * A wrapper class for communicating with our shared library
 */
public class NativeWrapper {

    // load our shared libraries
    static {
        System.loadLibrary("Playground");
    }

    /**
     * @return Hello from C++ JNI !
     */
    public native String stringFromJNI();

    public static native String readMemoryInfo(final String path);

    public String stringFromJava(String s) {
        Log.e("NativeWrapper", "Called this function from C code!");
        Log.e("NativeWrapper", "Got that from C code -> " + s);
        return "Returning this to the C code";
    }
}
