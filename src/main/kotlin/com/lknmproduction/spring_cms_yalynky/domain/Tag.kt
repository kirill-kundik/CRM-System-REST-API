package com.lknmproduction.spring_cms_yalynky.domain

import javax.persistence.*

@Entity
@Table(name = "tags")
data class Tag(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = 0,

        @Column(name = "name", nullable = false)
        var name: String? = null,

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "card_fk", nullable = false)
        var card: BoardCard? = null
)