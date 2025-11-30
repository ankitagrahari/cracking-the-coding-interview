package dbt.ctci.helper;

import junit.framework.Assert;

public class CustomAsserts {

    static Runtime runtime = Runtime.getRuntime();

    public static void dbtAssertEquals(Object expected, Object actual){
        long totalMemory = runtime.totalMemory();
        long start = System.currentTimeMillis();
        Assert.assertEquals(expected, actual);
        long end = System.currentTimeMillis();
        long freeMemory = runtime.freeMemory();

        long usedMemory = (totalMemory-freeMemory)/(1024*1024);
        long timeTaken = (end-start)/1000;
        System.out.println("Used Memory:"+ usedMemory +", time taken:"+ timeTaken + " secs");
    }

    public static void dbtAssertTrue(Object condition){
        long totalMemory = runtime.totalMemory();
        long start = System.currentTimeMillis();
        Assert.assertTrue((Boolean) condition);
        long end = System.currentTimeMillis();
        long freeMemory = runtime.freeMemory();

        long usedMemory = (totalMemory-freeMemory)/(1024*1024);
        long timeTaken = (end-start)/1000;
        System.out.println("Used Memory:"+ usedMemory +", time taken:"+ timeTaken + " secs");
    }

    public static void dbtAssertFalse(Object condition){
        long totalMemory = runtime.totalMemory();
        long start = System.currentTimeMillis();
        Assert.assertFalse((Boolean) condition);
        long end = System.currentTimeMillis();
        long freeMemory = runtime.freeMemory();

        long usedMemory = (totalMemory-freeMemory)/(1024*1024);
        long timeTaken = (end-start)/1000;
        System.out.println("Used Memory:"+ usedMemory +", time taken:"+ timeTaken + " secs");
    }
}
