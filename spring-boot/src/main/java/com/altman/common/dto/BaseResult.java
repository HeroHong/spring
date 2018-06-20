package com.altman.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResult<T> {
    private boolean ret;
    private T data;

    public static <T> BaseResult<T> error (T data) {
        return new BaseResult(false, data);
    }

    public static <T> BaseResult<T> success (T data) {
        return new BaseResult(true, data);
    }
}
