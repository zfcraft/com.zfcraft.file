package com.zfcraft.web.exception;


import com.zfcraft.web.enums.ResultEnum;

/**
 * Created by Administrator on 2017/12/12.
 */
public class ExportFileException extends RuntimeException {

    private Integer code;

    public ExportFileException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

   public ExportFileException(Integer code, java.lang.String message){

        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
