package com.springboot.user.dto;

import java.util.ArrayList;

import java.util.List;

 

public class Response {

 

                List<User> userList= new ArrayList<User>();

                  private List<Error> errors = new ArrayList<Error>();

                public List<User> getUserList() {

                                return userList;

                }

                public void setUserList(List<User> userList) {

                                this.userList = userList;

                }

                public List<Error> getErrors() {

                                return errors;

                }

                public void setErrors(List<Error> errors) {

                                this.errors = errors;

                }

               

}