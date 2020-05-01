package com.example.resteventhandler;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class EntityTwoEventHandler extends AbstractEventHandler<EntityTwo> {
    @Override
    @HandleBeforeCreate
    public void handle(EntityTwo entity) {
        super.handle(entity);
    }
}
