package com.exercise.designpatterns.chain;

import com.exercise.designpatterns.chain.domain.HandlerRequest;
import com.exercise.designpatterns.chain.domain.HandlerResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author 刘国奉
 * @version 1.0
 * @description
 * @date 2022/7/26 10:29
 **/
@Slf4j
public class PhoneVerifyHandler implements Handler {

    @Override
    public void doHandler(HandlerRequest handlerRequest, HandlerResponse handlerResponse, HandlerChain handlerChain) {
        if (Objects.equals(handlerRequest.getMobile(), "18922222222")) {
            log.info("mobile {}", handlerRequest.getMobile());
            handlerChain.doHandler(handlerRequest, handlerResponse);
        }
    }
}
