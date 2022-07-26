package com.exercise.designpatterns.chain;

import com.exercise.designpatterns.chain.domain.HandlerRequest;
import com.exercise.designpatterns.chain.domain.HandlerResponse;
import org.junit.Test;

/**
 * @author 刘国奉
 * @version 1.0
 * @description
 * @date 2022/7/26 11:37
 **/
public class AppChainTest {

    @Test
    public void testChainApp() {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new IdentityVerifyHandler());
        handlerChain.addHandler(new PhoneVerifyHandler());

        HandlerRequest handlerRequest = new HandlerRequest();
        handlerRequest.setIdentity("admin");
        handlerRequest.setMobile("18922222222");
        HandlerResponse handlerResponse = new HandlerResponse();
        handlerChain.doHandler(handlerRequest, handlerResponse);
    }

    @Test
    public void testChainIdentityVerifyHandler() {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new IdentityVerifyHandler());
        handlerChain.addHandler(new PhoneVerifyHandler());

        HandlerRequest handlerRequest = new HandlerRequest();
        handlerRequest.setIdentity("admin");
        handlerRequest.setMobile("18922222");
        HandlerResponse handlerResponse = new HandlerResponse();
        handlerChain.doHandler(handlerRequest, handlerResponse);
    }
}
