package com.org.structure.proxy.cacheProxy;

public class DatabaseDataQuery implements DataQuery {
    @Override
    public String query(String queryKey) {
        // 查询数据库并返回结果
        return "Result from database: " + queryKey;
    }
}
