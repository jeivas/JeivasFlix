package com.jeivasflix.jeivasflix.service;

public interface iConvertData {
    <T> T getData(String json, Class<T> classType);
}
