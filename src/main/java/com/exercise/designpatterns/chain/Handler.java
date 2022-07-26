package com.exercise.designpatterns.chain;

import com.exercise.designpatterns.chain.domain.HandlerRequest;
import com.exercise.designpatterns.chain.domain.HandlerResponse;

/**
 * @author 刘国奉
 * @version 1.0
 * @description
 * @date 2022/7/26 10:25
 **/
public interface Handler {
    void doHandler(HandlerRequest handlerRequest, HandlerResponse handlerResponse, HandlerChain handlerChain);
}
