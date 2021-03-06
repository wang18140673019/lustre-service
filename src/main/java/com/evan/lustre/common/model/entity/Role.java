package com.evan.lustre.common.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Role
 * @Description Role entity.
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/4 17:55
 */
@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "roleId", columnDefinition = "varchar(50) not null")
    private String roleId;

    @Column(name = "roleDescription", columnDefinition = "varchar(255) not null")
    private String roleDescription;
}
