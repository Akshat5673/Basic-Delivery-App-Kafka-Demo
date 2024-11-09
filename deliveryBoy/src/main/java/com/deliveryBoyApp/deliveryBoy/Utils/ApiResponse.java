package com.deliveryBoyApp.deliveryBoy.Utils;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private Map<String,String> message;
    private boolean success;
}
