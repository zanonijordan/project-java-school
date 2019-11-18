package mws_2018_039.appstudenti.util;

import java.util.ArrayList;

public class StringUtil {
    public static ArrayList<String> splitBy( String str, String sep ){
        ArrayList<String> list = new ArrayList<>();
        if( str==null || str.trim().equals("") ) return list;
        
        int pos = str.indexOf( sep );
        while ( pos >= 0) {
            String elemento = str.substring(0, pos);
            list.add( elemento );
            str = str.substring(pos+sep.length());
            pos = str.indexOf( sep );
        }
        list.add( str );
        
        return list;
    }
}
