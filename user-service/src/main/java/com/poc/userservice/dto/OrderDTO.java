package com.poc.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class OrderDTO {
    @Id
    @Field("id")
    private Integer id;
    @Field("name")
    private String name;
    @Field("category")
    private String category;
    @Field("date")
    private String date;
}
