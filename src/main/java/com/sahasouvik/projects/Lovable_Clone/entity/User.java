package com.sahasouvik.projects.Lovable_Clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)     //  automatically sets the access level for all the fields
public class User {
    Long id;
    String email;
    String passwordHash;
    String name;

    String avatarUrl;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;  //  soft delete
}
