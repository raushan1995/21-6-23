package com.cg.conferencedemo.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    private String session_name;
    private  String getSession_description;
    private Integer session_length;

    @ManyToMany
    @JoinTable(
        name="session_speakers",
        joinColumns= @JoinColumn(name = "session_id"),
        inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Speaker> speakers;

    public Session() {
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getGetSession_description() {
        return getSession_description;
    }

    public void setGetSession_description(String getSession_description) {
        this.getSession_description = getSession_description;
    }

    public Integer getSession_length() {
        return session_length;
    }

    public void setSession_length(Integer session_length) {
        this.session_length = session_length;
    }
}
