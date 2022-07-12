package com.furkan.simplewebapi.payload;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateStudentRequest {
    @NotNull
    @Size(min = 3, max = 25)
    private String name;

    @NotNull
    @Size(min = 3, max = 25)
    private String lastName;

    @NotNull
    @Min(18)
    @Max(99)
    private int age;
}
