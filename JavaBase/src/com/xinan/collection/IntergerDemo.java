package com.xinan.collection;
public class IntergerDemo {
	public static void main(String[] args){
		Integer integer1 = 127;
		Integer integer2 = 127;//-128---127，jvm机默认缓存,源码如下
	/*	
     * Cache to support the object identity semantics of autoboxing for values between
     * -128 and 127 (inclusive) as required by JLS.
     *
     * The cache is initialized on first usage.  The size of the cache
     * may be controlled by the {@code -XX:AutoBoxCacheMax=<size>} option.
     * During VM initialization, java.lang.Integer.IntegerCache.high property
     * may be set and saved in the private system properties in the
     * sun.misc.VM class.
     

    private static class IntegerCache {
        static final int low = -128;
        static final int high;
        static final Integer cache[];

        static {
            // high value may be configured by property
            int h = 127;
            String integerCacheHighPropValue =
                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
            if (integerCacheHighPropValue != null) {
                try {
                    int i = parseInt(integerCacheHighPropValue);
                    i = Math.max(i, 127);
                    // Maximum array size is Integer.MAX_VALUE
                    h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
                } catch( NumberFormatException nfe) {
                    // If the property cannot be parsed into an int, ignore it.
                }
            }
            high = h;

            cache = new Integer[(high - low) + 1];
            int j = low;
            for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);

            // range [-128, 127] must be interned (JLS7 5.1.7)
            assert IntegerCache.high >= 127;
        }

        private IntegerCache() {}*/
		System.out.println(integer1==integer2);
		System.out.println(integer1.equals(integer2));
		System.out.println("------------------------------");
		Integer integer3 =128;//
		Integer integer4 =128;
		System.out.println(integer3==integer4);
		System.out.println(integer3.equals(integer4));
		System.out.println("++++++++++++++++++++++++++++++");
		Integer integerA =new Integer(126);
		Integer integerB =new Integer(126);
		System.out.println(integerA==integerB);
		System.out.println(integerA.equals(integerB));
	}
}
