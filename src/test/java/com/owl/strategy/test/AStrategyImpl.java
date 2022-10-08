package com.owl.strategy.test;

import com.owl.strategy.interfaces.IStrategyConstraint;
import com.owl.strategy.interfaces.IStrategyEnum;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
@Service
public class AStrategyImpl implements IBusinessInterface{




  @Override
  public TestStrategyEnum strategy() {
    return TestStrategyEnum.A;
  }

  @Override
  public void echo() {
    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
  }
}
