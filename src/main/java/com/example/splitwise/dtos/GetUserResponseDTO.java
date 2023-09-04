package com.example.splitwise.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUserResponseDTO {
    private String name;
    private String uname;
    // not returning pwd -> sensitive information

    private ResponseStatus responseStatus;
    private String message;
}
