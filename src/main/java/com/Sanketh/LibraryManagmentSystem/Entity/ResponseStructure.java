package com.Sanketh.LibraryManagmentSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data
public class ResponseStructure <t>
{

    private String message;
    private int statusCode;
    private t data;
public ResponseStructure()
    {
        super();
    }
    public ResponseStructure(String message, int statusCode, t data) {
        super();
        this.message = message;
        this.statusCode = statusCode;
        this.data = data;
    }
}
