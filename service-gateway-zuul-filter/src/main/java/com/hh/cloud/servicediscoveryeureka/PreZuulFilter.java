package com.hh.cloud.servicediscoveryeureka;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class PreZuulFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(PreZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String remoteHost = request.getRemoteHost();
        LOGGER.info("#######请求的地址########-------"+remoteHost);
        return null;
    }
}
