package com.aritsd.arit.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    class BaseResponse<T> {
        private int statusCode;
        private T  body;


        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public Object getBody() {
            return body;
        }

        public void setBody(T body) {
            this.body = body;
        }
    }
}
