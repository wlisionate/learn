package frank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Response {

    private boolean success;//操作是否成功
    private String code;//错误码
    private String message;//错误信息
    private String stackTrack;//堆栈信息
    private Object data;//数据

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStackTrack() {
        return stackTrack;
    }

    public void setStackTrack(String stackTrack) {
        this.stackTrack = stackTrack;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
