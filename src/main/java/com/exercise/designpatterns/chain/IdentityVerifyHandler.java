package com.exercise.designpatterns.chain;

import com.exercise.designpatterns.chain.domain.HandlerRequest;
import com.exercise.designpatterns.chain.domain.HandlerResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author 刘国奉
 * @version 1.0
 * @description
 * @date 2022/7/26 10:30
 **/
@Slf4j
public class IdentityVerifyHandler implements Handler {

    @Override
    public void doHandler(HandlerRequest handlerRequest, HandlerResponse handlerResponse, HandlerChain handlerChain) {
        if (Objects.equals("admin", handlerRequest.getIdentity())) {
            log.info("{}", "admin");
            handlerChain.doHandler(handlerRequest, handlerResponse);
        }
    }
}
