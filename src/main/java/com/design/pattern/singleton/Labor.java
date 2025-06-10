package com.design.pattern.singleton;

import lombok.Synchronized;

public class Labor {

    //Thread Safe

    private static Labor labor;
    private Labor()
    {

    }

    //It's thread-safe but potentially inefficient because every call acquires the lock
    //For better performance, consider the double-checked locking pattern (for Java 5+) or use an enum singleton (the most robust approach)
//    public static synchronized Labor getLabor()
//    {
//        if(labor==null)
//        {
//            labor= new Labor();
//        }
//        return labor;
//    }

    public static Labor getLabor()
    {
        if(labor==null)
        {
            synchronized(Labor.class){
                if(labor==null)
                {
                    labor= new Labor();
                }
         }
        }
        return labor;
    }
}
