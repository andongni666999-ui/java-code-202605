package com.org.structure.proxy.safeProxy;

public class Client {

    public static void main(String[] args) {
        SensitiveDataQuery sensitiveDataQuery = new SensitiveDataQueryImpl();
        UserAuthenticator userAuthenticator = new UserAuthenticator();
        SensitiveDataQuery securityProxy = new SecurityProxy(sensitiveDataQuery, userAuthenticator);

        String userId1 = "user1";
        String userId2 = "user4";

        // 用户1具有访问权限
        System.out.println(securityProxy.queryData(userId1));

        // 用户4没有访问权限
        System.out.println(securityProxy.queryData(userId2));
    }
    
}
