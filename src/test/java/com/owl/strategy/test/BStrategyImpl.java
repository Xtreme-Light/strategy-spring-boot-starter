package com.owl.strategy.test;

import com.owl.strategy.interfaces.IStrategyConstraint;
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
public class BStrategyImpl implements IBusinessInterface {


  @Override
  public TestStrategyEnum strategy() {
    return TestStrategyEnum.B;
  }

  @Override
  public String echo() {
    return "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
  }
}
