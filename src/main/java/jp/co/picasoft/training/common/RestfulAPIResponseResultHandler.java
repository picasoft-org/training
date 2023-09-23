package jp.co.picasoft.training.common;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import org.springframework.lang.Nullable;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Restful API Response Handler
 */
@RestControllerAdvice
public class RestfulAPIResponseResultHandler<T> implements ResponseBodyAdvice<T> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {

        HttpServletRequest request = HttpContextUtil.getRequest();
        RestfulAPIResponseResult responseResultAnn = (RestfulAPIResponseResult) request
                .getAttribute(RestfulAPIResponseResultInterceptor.RESTFULAPI_RESPONSE_RESULT_ANN);
        return responseResultAnn == null ? false : true;
    }

    @SuppressWarnings("unchecked")
    public T beforeBodyWrite(@Nullable T body, MethodParameter returnType, MediaType selectedContentType,
            Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
            ServerHttpResponse response) {

        if (body instanceof Result) {
            return body;
        } else if (body instanceof String) {
            return (T) ResultFactory.success(body);
        } else {
            return (T) ResultFactory.success(body);
        }
    }
}
