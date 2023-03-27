package com.example.homework;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockRestController {

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseData processRequest(@RequestBody RequestData requestData) {
        String field = requestData.getField();
        ResponseData responseData = new ResponseData();
        responseData.setMessage("Запрос обработан успешно");
        responseData.setData(field);
        return responseData;
    }

}

class RequestData {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}

class ResponseData {

    private String message;
    private Object data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}