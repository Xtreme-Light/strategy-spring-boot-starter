package com.owl.strategy.interfaces;

/**
 * <p>
 * 枚举约束 增强
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
public interface IStrategyStruct<T extends Enum<?> & IStrategyEnum<T>, U extends IStrategyConstraint<T>> extends
    IStrategyEnum<T> {

  T getEnum();

  Class<U> getType();

  default T strategy() {
    return getEnum();
  }
}
