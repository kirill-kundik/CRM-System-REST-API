package com.lknmproduction.spring_cms_yalynky.domain

import javax.persistence.*

@Entity
@Table(name = "roles")
data class Role(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @Column(name = "name")
        var name: String

)