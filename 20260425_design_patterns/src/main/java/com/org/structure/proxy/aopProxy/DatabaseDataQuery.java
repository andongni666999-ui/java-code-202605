package com.org.structure.proxy.aopProxy;

import org.springframework.stereotype.Component;

@Component
public class DatabaseDataQuery implements DataQuery {
    @Override
    public String query(String queryKey) {
        // 他会使用数据源从数据库查询数据很慢
        System.out.println("正在从数据库查询数据");
        return "result";
    }


}
