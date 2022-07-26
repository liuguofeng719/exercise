package com.exercise.designpatterns.chain.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 刘国奉
 * @version 1.0
 * @description
 * @date 2022/7/26 10:26
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HandlerRequest {
    private String mobile;
    private String identity;
}
