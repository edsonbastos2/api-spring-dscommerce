package com.devsuperior.dscommerce.dto;

public class FieldMessage {

    private String fieldName;
    private String message;

    public FieldMessage(String fieldname, String message) {
        this.fieldName = fieldname;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
