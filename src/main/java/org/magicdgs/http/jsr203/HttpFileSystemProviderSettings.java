package org.magicdgs.http.jsr203;

import java.net.Proxy;

public class HttpFileSystemProviderSettings {

    private final Proxy proxy;
    private final boolean useCaching;


    private final int timeout;
    private final int maxRetries;


    public HttpFileSystemProviderSettings(final Proxy proxy, final boolean useCaching, final int timeout, final int maxRetries) {
        this.proxy = proxy;
        this.useCaching = useCaching;
        this.timeout = timeout;
        this.maxRetries = maxRetries;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public boolean isUseCaching() {
        return useCaching;
    }

    public int getTimeout() {
        return timeout;
    }


    public int getMaxRetries() {
        return maxRetries;
    }
}