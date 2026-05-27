package com.org.structure.proxy.cacheProxy;

import java.util.HashMap;
import java.util.Map;

public class CachingDataQueryProxy implements DataQuery {
    private final DataQuery realDataQuery;
    private final Map<String, String> cache;

    public CachingDataQueryProxy(DataQuery realDataQuery) {
        this.realDataQuery = new DatabaseDataQuery(); // 真是的代理对象
        cache = new HashMap<>();
    }

    @Override
    public String query(String queryKey) {
        String result = cache.get(queryKey);
        if (result == null) {
            result = realDataQuery.query(queryKey);
            cache.put(queryKey, result);
            System.out.println("Result retrieved from database and added to cache.");
        } else {
            System.out.println("Result retrieved from cache.");
        }
        return result;
    }
}