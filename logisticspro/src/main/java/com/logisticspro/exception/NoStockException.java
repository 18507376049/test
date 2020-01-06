package com.logisticspro.exception;

/**
 * 定义库存不足的异常
 */
public class NoStockException extends RuntimeException {
    public NoStockException() {
    }

    public NoStockException(String message) {
        super(message);
    }

    public NoStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoStockException(Throwable cause) {
        super(cause);
    }

    public NoStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
