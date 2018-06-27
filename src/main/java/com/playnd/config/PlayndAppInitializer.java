package com.playnd.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;


/**
 * Created by Bae B K on 2018. 6. 27.
 */
@Slf4j
public class PlayndAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };//RootConfig
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfig.class };
    }
    
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] { new DelegatingFilterProxy("csrfFilter") };
    }
}
