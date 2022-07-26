package com.exercise.designpatterns.chain;

import com.exercise.designpatterns.chain.domain.HandlerRequest;
import com.exercise.designpatterns.chain.domain.HandlerResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘国奉
 * @version 1.0
 * @description
 * @date 2022/7/26 10:24
 **/
public class HandlerChain {

    private List<Handler> handlers = new ArrayList<>();
    private int index = 0;

    public HandlerChain addHandler(Handler handler) {
        handlers.add(handler);
        return this;
    }

    public void doHandler(HandlerRequest handlerRequest, HandlerResponse handlerResponse) {
        if (index == handlers.size()) {
            return;
        }
        final Handler handler = handlers.get(index);
        index++;
        handler.doHandler(handlerRequest, handlerResponse, this);
    }
}
