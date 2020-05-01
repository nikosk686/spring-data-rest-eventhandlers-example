package com.example.resteventhandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;

@Slf4j
public abstract class AbstractEventHandler<E> {

    @HandleBeforeCreate
    public void handle(E entity) {
        log.info("inside entity event handler");
    }
}
