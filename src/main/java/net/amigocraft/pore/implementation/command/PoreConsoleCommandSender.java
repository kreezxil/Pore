package net.amigocraft.pore.implementation.command;

import org.apache.commons.lang.NotImplementedException;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;

// TODO: Bridge

// TODO: Bridge

public class PoreConsoleCommandSender extends PoreServerCommandSender implements ConsoleCommandSender {

	@Override
	public boolean isConversing() {
		return false;
	}

	@Override
	public void acceptConversationInput(String input) {
		throw new NotImplementedException();
	}

	@Override
	public boolean beginConversation(Conversation conversation) {
		return false;
	}

	@Override
	public void abandonConversation(Conversation conversation) {
		throw new NotImplementedException();
	}

	@Override
	public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
		throw new NotImplementedException();
	}

	@Override
	public void sendRawMessage(String message) {
		throw new NotImplementedException();
	}

}
