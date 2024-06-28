package com.vermau2k01.scm20.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contacts {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String address;
    @Column(length = 1000)
    private String profilePicture;
    @Column(length = 1000)
    private String description;
    private boolean isFavorite = false;
    @OneToMany(mappedBy = "contacts", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<SocialLink> socialLink= new ArrayList<>();
    @ManyToOne
    private User user;

}
