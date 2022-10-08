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
    assert "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".equals(iBusinessInterface.echo());
    final IBusinessInterface iBusinessInterface1 = iStrategy.pickStrategy(TestStrategyEnum.B,
        IBusinessInterface.class);
    assert "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb".equals(iBusinessInterface1.echo());
    final IBusinessInterface iBusinessInterface2 = iStrategy.pickStrategy(TestStrategyEnum.C,
        IBusinessInterface.class);
    assert "ccccccccccccccccccccccccccccccccccccccc".equals(iBusinessInterface2.echo());

    final IBusinessInterface iBusinessInterface3 = iStrategy.pickStrategy(TestStrategyEnum.A);
    iBusinessInterface3.echo();
    assert "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".equals(iBusinessInterface3.echo());

  }

}
