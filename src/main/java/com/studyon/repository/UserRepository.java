package com.studyon.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String save(){
        return "UserRepository 회원 저장";
    }
}
