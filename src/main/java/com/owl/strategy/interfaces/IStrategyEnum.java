package com.owl.strategy.interfaces;

/**
 * <p>
 *  枚举约束
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
public interface IStrategyEnum<T extends Enum<?>> {

  /**
   * @return strategy type
   */
  T strategy();
}
