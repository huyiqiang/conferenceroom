package com.unicom.conferenceroom.entity.dervice;

import java.io.Serializable;

public class ResultInfo<T> implements Serializable {

    //定义java实体对象（ResultInfo）时实现Serializable接口，实现序列化
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
