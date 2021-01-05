package com.user.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    String idUser;

    String userName;
}
