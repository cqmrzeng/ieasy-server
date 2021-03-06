package com.baayso.springboot.common.exception;

import com.baayso.commons.exception.ApiException;
import com.baayso.commons.tool.ResponseStatus;

/**
 * 专用于 API Service层的异常。
 *
 * @author ChenFangjie (2014/12/20 16:39:58)
 * @since 1.0.0
 */
public class ApiServiceException extends ApiException {

    private static final long serialVersionUID = -3247721709918992766L;

    public ApiServiceException() {
    }

    public ApiServiceException(ResponseStatus responseStatus) {
        super(responseStatus);
    }

}
