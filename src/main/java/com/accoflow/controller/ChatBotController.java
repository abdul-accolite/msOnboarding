package com.accoflow.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accoflow.models.Question;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.CreateSessionOptions;
import com.ibm.watson.assistant.v2.model.MessageInput;
import com.ibm.watson.assistant.v2.model.MessageOptions;
import com.ibm.watson.assistant.v2.model.MessageResponse;
import com.ibm.watson.assistant.v2.model.SessionResponse;

@RestController
public class ChatBotController {

	public String chatbot(String q){
		IamAuthenticator authenticator = new IamAuthenticator("VJsOvgp5V0VaQRySjCtL_nZKM8iVCgrhhvYPkH8uZSYw");
		Assistant assistant = new Assistant("2020-02-04", authenticator);
		assistant.setServiceUrl("https://api.eu-gb.assistant.watson.cloud.ibm.com/instances/ca7ae510-bbf6-4397-bd16-c5a9a0e9247a");

		CreateSessionOptions options = new CreateSessionOptions.Builder("06f61aae-a15b-4a8f-ab3a-10caaa93d2e8").build();

		SessionResponse response = assistant.createSession(options).execute().getResult();
		MessageInput input = new MessageInput.Builder().messageType("text").text(q).build();
		MessageOptions options1 = new MessageOptions.Builder("06f61aae-a15b-4a8f-ab3a-10caaa93d2e8",response.getSessionId()).input(input).build();

		MessageResponse response1 = assistant.message(options1).execute().getResult();
		return (response1.getOutput().getGeneric().get(0).text());
	}
	
	@PostMapping("/chatbot")
	public Question welcome(@RequestBody Question q)
	{
		q.setQ(chatbot(q.getQ()));
		return q;
	} 
	
	
}
