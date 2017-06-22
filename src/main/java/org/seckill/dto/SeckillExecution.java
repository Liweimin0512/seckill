package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/**
 * 封装秒杀执行后的结果
 * Created by 24102 on 2017/6/22.
 */
public class SeckillExecution {
    private Long seckillId;

    private Integer state;

    private String stateInfo;

    private SuccessKilled successKilled;

    public SeckillExecution(Long seckillId, SeckillStatEnum stateEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateInfo;
        this.successKilled = successKilled;
    }

    public SeckillExecution(Long seckillId, SeckillStatEnum stateEnum, String stateInfo) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateInfo;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }
}
