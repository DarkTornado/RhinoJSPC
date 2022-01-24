package com.darktornado.rhinojspc;

import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSStaticFunction;

public class Api extends ScriptableObject {

    @Override
    public String getClassName() {
        return "Api";
    }
    
    @JSStaticFunction
    public static boolean print(final String msg) {
    	if(MainUI.output==null) return false;
    	MainUI.output.append(msg+"\n");
    	return true;
    }

}
