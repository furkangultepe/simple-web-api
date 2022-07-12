package com.furkan.simplewebapi.payload;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class  UpdateStudentRequest {
    @NotNull
    @Size(min = 3, max = 25)
    private String name;

    @NotNull
    @Size(min = 3, max = 25)
    private String lastName;
}
