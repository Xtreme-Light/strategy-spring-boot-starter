package com.owl.strategy;


import com.owl.strategy.interfaces.IStrategyConstraint;
import com.owl.strategy.interfaces.IStrategyEnum;
import com.owl.strategy.interfaces.IStrategyStruct;


/**
 * <p>
 * 策略接口，获取对应的实际策略
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
public interface IStrategy {

  <T extends Enum<?> & IStrategyEnum<T>,U extends IStrategyConstraint<T>> U pickStrategy(
      T strategy,Class<U> type);


  default   <T extends Enum<?> & IStrategyEnum<T>,U extends IStrategyConstraint<T>> U pickStrategy(
      IStrategyStruct<T,U> iStrategyStruct){
    return pickStrategy(iStrategyStruct.getEnum(), iStrategyStruct.getType());
  }

}
