package com.owl.strategy.config;

import static com.owl.strategy.config.StrategyProperties.PREFIX;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 *  策略装配开关
 * </p>
 *
 * @author light
 * @since 2022-10-09
 **/
@ConfigurationProperties(prefix = PREFIX)
@Data
public class StrategyProperties {
  public static final String PREFIX = "owl.strategy";
  /**
   * 策略装配开关
   */
  private boolean enabled = true;
}
