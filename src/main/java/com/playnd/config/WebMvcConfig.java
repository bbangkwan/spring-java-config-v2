package com.playnd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.context.request.async.TimeoutCallableProcessingInterceptor;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.util.UrlPathHelper;
import java.util.List;

/**
 * Created by Bae B K on 2018. 6. 27.
 */
@Configuration
@ComponentScan(basePackages = "com.playnd")
@EnableWebMvc
@EnableScheduling
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper pathHelper = new UrlPathHelper();
        pathHelper.setRemoveSemicolonContent(false); // For @MatrixVariable's
        configurer.setUrlPathHelper(pathHelper);
    }
    
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
    
    }
    
    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setDefaultTimeout(3000);
        configurer.registerCallableInterceptors(new TimeoutCallableProcessingInterceptor());
    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    
    }
    
    @Override
    public void addFormatters(FormatterRegistry registry) {
    
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    
    }
    
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/webapp/", ".jsp");
    }
    
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
    
    }
    
    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
    
    }
    
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    
    }
    
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
    
    }
    
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
    
    }
    
    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
    
    }
    
    @Override
    public Validator getValidator() {
        return null;
    }
    
    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
