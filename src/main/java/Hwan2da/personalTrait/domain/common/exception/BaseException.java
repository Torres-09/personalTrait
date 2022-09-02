package Hwan2da.personalTrait.domain.common.exception;

import Hwan2da.personalTrait.domain.common.exception.type.ErrorCode;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private ErrorCode errorCode;
    public BaseException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode=errorCode;
    }
    public ErrorCode getErrorCode(){
        return this.errorCode;
    }
}
