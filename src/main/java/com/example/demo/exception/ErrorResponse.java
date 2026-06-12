package com.example.demo.exception;
import lombok.*;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
}
