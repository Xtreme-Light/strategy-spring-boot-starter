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
public class CStrategyImpl implements IBusinessInterface {


  @Override
  public TestStrategyEnum strategy() {
    return TestStrategyEnum.C;
  }

  @Override
  public void echo() {
    System.out.println("ccccccccccccccccccccccccccccccccccccccc");
  }
}
