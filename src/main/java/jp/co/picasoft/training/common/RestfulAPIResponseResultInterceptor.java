package jp.co.picasoft.training.common;

import java.lang.reflect.Method;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * The Interceptor for restful API Response
 * 
 * @author zhangcg
 * @version 1.0
 */
public class RestfulAPIResponseResultInterceptor implements AsyncHandlerInterceptor {

    /**
     * mark
     */
    public static final String RESTFULAPI_RESPONSE_RESULT_ANN = "RESTFULAPI_RESPONSE-RESULT-ANN";

    /**
     * コントローラーの実行前の処理
     * 
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @param handler Target Object
     * 
     * @return コントローラーの実行前の処理結果
     * @throws コントローラーの実行前の処理中の例外
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        if (handler instanceof HandlerMethod) {
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Class<?> clazz = handlerMethod.getBeanType();
            final Method method = handlerMethod.getMethod();
            // Class Annotition
            if (clazz.isAnnotationPresent(RestfulAPIResponseResult.class)) {
                // Set this Annotation to Request Attribute and pass it to ResponseBodyAdvice
                request.setAttribute(RESTFULAPI_RESPONSE_RESULT_ANN, clazz.getAnnotation(RestfulAPIResponseResult.class));
                // Method Annotition
            } else if (method.isAnnotationPresent(RestfulAPIResponseResult.class)) {
                // Set this Annotation to Request Attribute and pass it to ResponseBodyAdvice
                request.setAttribute(RESTFULAPI_RESPONSE_RESULT_ANN, clazz.getAnnotation(RestfulAPIResponseResult.class));
            }
        }
        return true;
    }
}
