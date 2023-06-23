package com.defect.tracker.event;

import org.springframework.context.ApplicationEvent;

import com.defect.tracker.user.User;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {
	private User user;
	private String applicationUrl;
	//Spring Security 6 | How to Create a Login System with Spring Data JPA and JWTs [NEW 2023]
	public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }

}
