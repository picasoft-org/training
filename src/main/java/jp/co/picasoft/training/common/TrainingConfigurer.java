package jp.co.picasoft.training.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 */
@Configuration
public class TrainingConfigurer implements WebMvcConfigurer {
    
    @Bean
    RestfulAPIResponseResultInterceptor getRestfulAPIResponseResultInterceptor() {
        return new RestfulAPIResponseResultInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getRestfulAPIResponseResultInterceptor());
    }
}
