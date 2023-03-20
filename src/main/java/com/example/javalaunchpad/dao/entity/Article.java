package com.example.javalaunchpad.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Article extends BaseEntity{

    private String title;
    private String body;
    private boolean published;
    private Long views;

    @ElementCollection
    @CollectionTable
    @OrderColumn
    private List<String> images;

}
