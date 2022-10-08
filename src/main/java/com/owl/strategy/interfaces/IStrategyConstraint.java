package com.owl.strategy.interfaces;

/**
 * <p>
 * 策略实现接口
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
public interface IStrategyConstraint<U extends Enum<?> & IStrategyEnum<U>> {

  U strategy();
}
