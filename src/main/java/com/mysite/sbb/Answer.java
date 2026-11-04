package com.mysite.sbb;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Getter
@Setter
public class Answer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private LocalDateTime createDate;

    // manytoone 에는 꼭 fetch = LAZY 를 붙여야 한다.
    // 안붙이면 default가 EAGER라서 question을 select할때 answer도 같이 select됨
    @ManyToOne(fetch = LAZY) // 1에 해당하는 변수에 붙임. 필수
    private Question question;

    @Column(columnDefinition = "TEXT")
    private String content;
}