package org.sid.orderservice.model;

import lombok.Data;
// reference
@Data
public class Customer {
    private Long id;
    private String name;
    private String email;
}
