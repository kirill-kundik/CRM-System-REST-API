package com.lknmproduction.spring_cms_yalynky.repository

import com.lknmproduction.spring_cms_yalynky.domain.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import java.util.*

interface RoleRepository : JpaRepository<Role, Long> {
    fun findByName(@Param("name") name: String): Optional<Role>
}