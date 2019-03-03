package com.dmall.delivery.context;

import com.dmall.delivery.common.vo.DeliveryBaseVO;
import com.dmall.delivery.strategy.ValidationStrategy;
import com.dmall.delivery.strategy.validationenum.ValidationType;

import java.util.*;

public class StrategyCenter {

    private Set<ValidationStrategy> setStrategies;

    private Queue<ValidationStrategy> queueStrategies;

    /**
     * 非顺序性校验使用
     * @param setStrategies
     */
    public StrategyCenter(Set<ValidationStrategy> setStrategies) {
        this.setStrategies = setStrategies;
    }

    /**
     * 顺序型校验使用
     * @param queueStrategies
     */
    public StrategyCenter(Queue<ValidationStrategy> queueStrategies) {
        this.queueStrategies = queueStrategies;
    }

    /**
     * set集合中策略执行
     * 该功能适合串行校验
     * @param deliveryBaseVO
     * @return
     */
    public ValidationType executeInSet(DeliveryBaseVO deliveryBaseVO){
        ValidationStrategy strategy;
        for(Iterator<ValidationStrategy> iterator = setStrategies.iterator();iterator.hasNext();){
            strategy = iterator.next();
            if (strategy.validate(deliveryBaseVO)){
                return strategy.getValidationType();
            }
        }
        return null;
    }

    /**
     * queue集合中执行顺序策略
     * 该功能适合串行校验
     * @param deliveryBaseVO
     * @return
     */
    public ValidationType executeInQueue(DeliveryBaseVO deliveryBaseVO){
        ValidationStrategy strategy;
        for (Iterator<ValidationStrategy> iterator = queueStrategies.iterator();iterator.hasNext();){
            strategy = iterator.next();
            if (strategy.validate(deliveryBaseVO)){
                return strategy.getValidationType();
            }
        }
        return null;
    }

    /**
     * 校验所有并且返回未成功项
     * 该功能适合并行校验
     * @param deliveryBaseVO
     * @return
     */
    public List<ValidationType> executeInSetAndGetList(DeliveryBaseVO deliveryBaseVO) {
        ValidationStrategy strategy;
        List<ValidationType> validatedTypes = new ArrayList<ValidationType>();
        for (Iterator<ValidationStrategy> iterator = setStrategies.iterator(); iterator.hasNext();) {
            strategy = iterator.next();
            if (strategy.validate(deliveryBaseVO)) {
                validatedTypes.add(strategy.getValidationType());
            }
        }
        return validatedTypes;
    }


    public List<ValidationType> executeInQueueAndGetList(DeliveryBaseVO deliveryBaseVO) {
        ValidationStrategy strategy;
        List<ValidationType> validatedTypes = new ArrayList<ValidationType>();
        for (Iterator<ValidationStrategy> iterator = queueStrategies.iterator(); iterator.hasNext();) {
            strategy = iterator.next();
            if (strategy.validate(deliveryBaseVO)) {
                validatedTypes.add(strategy.getValidationType());
            }
        }
        return validatedTypes;
    }

    public boolean isSetStrategy(){
        return setStrategies!=null;
    }

    public boolean isQueueStrategy(){
        return queueStrategies!=null;
    }


}
