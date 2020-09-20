package com.unicom.conferenceroom.entity;

import java.io.Serializable;

/**
 * @Author DangShuang
 * @Date 2020/7/23 15:05
 * @Version 1.0
 */
public class ResultInfo<T> implements Serializable {

    private static final long serialVersionUID = -8137872469826037970L;

    private int code = -1;
    private String resultInfo;
    private T retObj;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public T getRetObj() {
        return retObj;
    }

    public void setRetObj(T retObj) {
        this.retObj = retObj;
    }
}
