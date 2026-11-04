package com.mysite.sbb;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private LocalDateTime createDate;

    @ManyToOne // 1에 해당하는 변수에 붙임. 필수
    private Question question;

    @Column(columnDefinition = "TEXT")
    private String content;
}