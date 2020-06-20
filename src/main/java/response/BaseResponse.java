package response;

import org.springframework.http.ResponseEntity;

public class BaseResponse<T> {
    private int statusCOde;
    private T  body;


    public int getStatusCOde() {
        return statusCOde;
    }

    public void setStatusCOde(int statusCOde) {
        this.statusCOde = statusCOde;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
