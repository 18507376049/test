package com.logisticspro.exception;

/**
 * 定义余额不足的异常
 */
public class NoBalanceException extends RuntimeException {
    public NoBalanceException() {
    }

    public NoBalanceException(String message) {
        super(message);
    }

    public NoBalanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoBalanceException(Throwable cause) {
        super(cause);
    }

    public NoBalanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
