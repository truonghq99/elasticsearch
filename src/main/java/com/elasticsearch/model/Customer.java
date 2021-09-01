package com.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import lombok.Data;

@Data
@Document(indexName="customer")
public class Customer {
    
    @Id
    @Field(type=FieldType.Keyword)
    private String id;

    @Field(type=FieldType.Text)
    private String name;
}
