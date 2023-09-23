package jp.co.picasoft.training.common;

import java.util.Objects;

import org.springframework.web.context.request.RequestContextHolder;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * HttpContextツール
 */

public class HttpContextUtil {

    /**
     * コンストラクター
     */
    private HttpContextUtil() {

    }

    /**
     * Get HttpServletRequest
     * 
     * @return HttpServletRequest
     */
    public static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes()))
                .getRequest();
    }

}
