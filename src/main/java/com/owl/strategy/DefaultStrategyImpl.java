package com.owl.strategy;

import com.owl.strategy.interfaces.IStrategyConstraint;
import com.owl.strategy.interfaces.IStrategyEnum;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <p>
 * 默认策略实现类
 * </p>
 *
 * @author light
 * @since 2022-10-08
 **/
@Slf4j
public class DefaultStrategyImpl implements IStrategy, ApplicationContextAware {


  public Map<IStrategyEnum<?>, IStrategyConstraint<?>> container = new ConcurrentHashMap<>();


  @SuppressWarnings({"rawtypes"})
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    final Map<String, IStrategyConstraint> beansOfType = applicationContext.getBeansOfType(
        IStrategyConstraint.class);
    beansOfType.values().forEach(v -> {
      final Enum strategy = v.strategy();
      container.put((IStrategyEnum<?>) strategy,  v);
    });
  }

  @SuppressWarnings({"unchecked"})

  @Override
  public <T extends Enum<?> & IStrategyEnum<T>, U extends IStrategyConstraint<T>> U pickStrategy(
      T strategy, Class<U> type) {
    return (U) container.get(strategy);
  }


}
