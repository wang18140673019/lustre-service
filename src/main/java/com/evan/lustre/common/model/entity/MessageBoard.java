package com.evan.lustre.common.model.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName LiveMessage
 * @Description Message board entity.
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/4 18:05
 */
@Data
@Entity
@Table(name = "messageboard")
@EntityListeners(AuditingEntityListener.class)
public class MessageBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "senderId", columnDefinition = "int(32) not null")
    private Integer senderId;

    @Column(name = "receiverId", columnDefinition = "int(32) not null")
    private Integer receiverId;

    @Column(name = "content", columnDefinition = "varchar(50) not null")
    private String content;

    @CreatedDate
    @Column(name = "createTime", columnDefinition = "timestamp not null default current_timestamp")
    private Date createTime;

    @LastModifiedDate
    @Column(name = "updateTime", columnDefinition = "timestamp not null default current_timestamp")
    private Date updateTime;
}
