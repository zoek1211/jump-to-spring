package com.mysite.sbb;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private LocalDateTime createDate;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

//    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
//    private List<Answer> answers; // ANSWER_ID_LIST 같은 칼럼은 생기지 않는다.

    // mappedBy 속성을 지정하지 않으면 중간테이블을 만든다.
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Answer> answers;
}