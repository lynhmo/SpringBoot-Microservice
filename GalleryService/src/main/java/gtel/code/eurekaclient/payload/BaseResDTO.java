package gtel.code.eurekaclient.payload;

public class BaseResDTO {
    private String status;
    private Object data;
    private String error;
    public BaseResDTO(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public BaseResDTO(String status, String error) {
        this.status = status;
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
