package com.owl.strategy.config;

import com.owl.strategy.DefaultStrategyImpl;
import com.owl.strategy.IStrategy;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 装配
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(value = "owl.strategy.enabled", matchIfMissing = true, havingValue = "true")
@EnableConfigurationProperties(StrategyProperties.class)
public class StrategyConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public IStrategy iStrategy(ApplicationContext applicationContext) {
    final DefaultStrategyImpl defaultStrategy = new DefaultStrategyImpl();
    defaultStrategy.setApplicationContext(applicationContext);
    return defaultStrategy;
  }


}
