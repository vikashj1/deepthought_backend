package com.vikash.DeepThoughtBackend.Model;

import java.time.LocalDateTime;

public class Event {
    private String id;
    private String name;
    private LocalDateTime schedule;
    private String description;
    private String category;
    private String moderator;
    private String type;
    private Integer limit;
    private Integer page;

    public Event(String type,Integer limit, Integer page,String id, String name, LocalDateTime schedule, String description, String category, String moderator, String sub_category, Integer rigor_rank, String tagline) {
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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Event(){

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

    public Integer getRigor_rank() {
        return rigor_rank;
    }

    public void setRigor_rank(Integer rigor_rank) {
        this.rigor_rank = rigor_rank;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    private String sub_category;
    private Integer rigor_rank;
    private String tagline;

}
