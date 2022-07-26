package com.exercise.designpatterns.chain;

import com.exercise.designpatterns.chain.domain.HandlerRequest;
import com.exercise.designpatterns.chain.domain.HandlerResponse;

/**
 * @author 刘国奉
 * @version 1.0
 * @description
 * @date 2022/7/26 10:40
 **/
public class AppChain {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new IdentityVerifyHandler());
        handlerChain.addHandler(new PhoneVerifyHandler());

        HandlerRequest handlerRequest = new HandlerRequest();
        handlerRequest.setIdentity("admin");
        handlerRequest.setMobile("18922222222");
        HandlerResponse handlerResponse = new HandlerResponse();
        handlerChain.doHandler(handlerRequest, handlerResponse);
    }
}
