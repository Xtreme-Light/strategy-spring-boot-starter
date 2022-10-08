package com.owl.strategy;


import com.owl.strategy.config.StrategyConfiguration;
import com.owl.strategy.test.IBusinessInterface;
import com.owl.strategy.test.TestStrategyEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {StrategyConfiguration.class,StrategyMainStarter.class})
class StrategySpringBootStarterApplicationTests {


  @Autowired
  private IStrategy iStrategy;

  @Test
  void contextLoads() {
    final IBusinessInterface iBusinessInterface = iStrategy.pickStrategy(
        TestStrategyEnum.A, IBusinessInterface.class);
    iBusinessInterface.echo();
    final IBusinessInterface iBusinessInterface1 = iStrategy.pickStrategy(TestStrategyEnum.B,
        IBusinessInterface.class);
    iBusinessInterface1.echo();
    final IBusinessInterface iBusinessInterface2 = iStrategy.pickStrategy(TestStrategyEnum.C,
        IBusinessInterface.class);
    iBusinessInterface2.echo();


  }

}
