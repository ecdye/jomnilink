/**
 * Copyright (c) 2009-2021 Dan Cunningham
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.digitaldan.jomnilinkII.MessageTypes;

import com.digitaldan.jomnilinkII.Message;

import lombok.ToString;

/*
 * ACKNOWLEDGEMENT MESSAGES
 *
 * Acknowledgement messages are sent to acknowledge the receipt of another
 * message. An END OF DATA message is sent in response to a message to indicate
 * that the message was received correctly, but the information for the request
 * does not exist.
 *
 * END OF DATA
 *
 *     Start character      0x21
 *     Message length       0x01
 *     Message Type         0x03
 *     Data                 none
 *     CRC 1                0x41
 *     CRC 2                0x91
 */
@ToString
public class EndOfData implements Message {
	private static EndOfData INSTANCE = new EndOfData();

	public static EndOfData getInstance() {
		return INSTANCE;
	}

	@Override
	public int getMessageType() {
		return MESG_TYPE_END_OF_DATA;
	}
}
