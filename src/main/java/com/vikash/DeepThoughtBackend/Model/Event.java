package com.vikash.DeepThoughtBackend.Model;

import jakarta.persistence.*;


import java.time.LocalDateTime;
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "schedule")
    private LocalDateTime schedule;
    @Column(name = "description")
    private String description;
    @Column(name = "category")
    private String category;
    @Column(name = "`moderator`")
    private String moderator;
    @Column(name = "`type`")
    private String type;
    @Column(name = "`limit`")
    private int limit;
    @Column(name = "`page`")
    private int page;
    @Column(name = "sub_category")
    private String sub_category;
    @Column(name = "rigor_rank")
    private int rigor_rank;
    @Column(name = "`tagline`")
    private String tagline;


    public Event(String type,int limit, int page, String id, String name, LocalDateTime schedule, String description, String category, String moderator, String sub_category, int rigor_rank, String tagline) {
        super();
        this.limit= limit;
        this.type= type;
        this.page = page;
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.description = description;
        this.category = category;
        this.moderator = moderator;
        this.sub_category = sub_category;
        this.rigor_rank = rigor_rank;
        this.tagline = tagline;
    }
    public Event(){

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModerator() {
        return moderator;
    }

    public void setModerator(String moderator) {
        this.moderator = moderator;
    }

    public String getSub_category() {
        return sub_category;
    }

    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }

    public int getRigor_rank() {
        return rigor_rank;
    }

    public void setRigor_rank(int rigor_rank) {
        this.rigor_rank = rigor_rank;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }


}
