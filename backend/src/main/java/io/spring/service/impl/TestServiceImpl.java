package io.spring.service.impl;

import io.spring.model.Message;
import org.springframework.stereotype.Service;

import io.spring.service.intf.TestService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

	public List<Message> test() {
        ArrayList<Message> messages = new ArrayList<Message>();

        messages.add(new Message("Title Message 1", " This is a text of the Message 1"));
        messages.add(new Message("Title Message 2 ", "This is a text of the Message 2"));

        return messages;
    }

}
