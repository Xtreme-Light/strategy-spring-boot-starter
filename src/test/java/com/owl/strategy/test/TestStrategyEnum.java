package com.owl.strategy.test;

import com.owl.strategy.interfaces.IStrategyEnum;
import com.owl.strategy.interfaces.IStrategyStruct;

/**
 * <p>
 *  完美
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
public enum TestStrategyEnum implements IStrategyStruct<TestStrategyEnum,IBusinessInterface> {
  A,
  B,
  C
  ;

  @Override
  public TestStrategyEnum getEnum() {
    return this;
  }

  @Override
  public Class<IBusinessInterface> getType() {
    return IBusinessInterface.class;
  }




}
