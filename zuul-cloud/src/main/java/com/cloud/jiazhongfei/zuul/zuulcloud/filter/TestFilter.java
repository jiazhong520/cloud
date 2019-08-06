//package com.cloud.jiazhongfei.zuul.zuulcloud.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.exception.ZuulException;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.stereotype.Component;
//
//@Component
//@Log4j2
//public class TestFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//       log.info("filterType");
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        log.info("filterOrder");
//        return 0;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        log.info("shouldFilter");
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        log.info("run");
//        return null;
//    }
//}
