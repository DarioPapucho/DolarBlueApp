package com.varqulabs.dolarblue.auth.domain.model

data class LoginRequest(
    val email: String,
    val password: String
)