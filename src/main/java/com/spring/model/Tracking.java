package com.spring.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Tracking {
    private static final long serialVersionUID = 8046162716367847201L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trackingid")
    private int trackingid;
    private String trackingstatus;
}
