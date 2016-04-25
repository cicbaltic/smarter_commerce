package com.smartercommerce.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.smartercommerce")


public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		registry
			.addResourceHandler("/resources/**")
			.addResourceLocations("/resources/");
	}
	// <<<<<<<<<INTERNATIONALIZATION PART STARTS>>>>>>>>>
		// Loads all messages beans properties
		@Bean
		public MessageSource messageSource(){
			ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource(); 
			messageSource.setBasename("messages");
			return messageSource;
		}
		
		//Looks through the session and checks if there is a localeResolver assign to our session, sets default language
		@Bean
		public LocaleResolver localeResolver() {
			SessionLocaleResolver resolver = new SessionLocaleResolver();
			resolver.setDefaultLocale(Locale.ENGLISH);
			return resolver;	
		}
		//interpretate urls
		@Override
		public void addInterceptors(InterceptorRegistry registry){
			LocaleChangeInterceptor changeInterceptor = new LocaleChangeInterceptor();
			changeInterceptor.setParamName("language");
			registry.addInterceptor(changeInterceptor);
		}
		// <<<<<<<<<INTERNATIONALIZATION PART ENDS>>>>>>>>>
}
