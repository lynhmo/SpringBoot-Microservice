package gtel.code.authService.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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
}
