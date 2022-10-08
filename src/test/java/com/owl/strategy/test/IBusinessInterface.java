package com.owl.strategy.test;

import com.owl.strategy.interfaces.IStrategyConstraint;

/**
 * <p>
 *
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
public interface IBusinessInterface extends IStrategyConstraint<TestStrategyEnum> {

  String echo();
}
