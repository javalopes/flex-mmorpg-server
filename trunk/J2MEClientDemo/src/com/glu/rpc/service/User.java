package com.glu.rpc.service;
// Generated by proto2javame, Mon Dec 07 22:42:18 CST 2009. DO NOT EDIT!

import java.io.IOException;
import java.io.InputStream;

import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.factory.JavaMeProtoFactory;
import net.jarlehansen.protobuf.javame.input.DelimitedInputStream;
import net.jarlehansen.protobuf.javame.input.DelimitedSizeUtil;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.output.AbstractOutputWriter;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.util.ComputeSizeUtil;

public final class User extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final String userName;
	private static final int fieldNumberUserName = 1;
	private final boolean hasUserName;

	private final String password;
	private static final int fieldNumberPassword = 2;
	private final boolean hasPassword;

	private final String email;
	private static final int fieldNumberEmail = 3;
	private final boolean hasEmail;


	public static Builder newBuilder() {
		return new Builder();
	}

	private User(final Builder builder) {
		if (true) {
			this.userName = builder.userName;
			this.hasUserName = builder.hasUserName;
			this.password = builder.password;
			this.hasPassword = builder.hasPassword;
			this.email = builder.email;
			this.hasEmail = builder.hasEmail;
		} else {
			throw new UninitializedMessageException("Not all required fields were included, " + 
				", all fields that are false are mandatory but were not added");
		}
	}

	public static class Builder {
		private String userName;
		private boolean hasUserName = false;

		private String password;
		private boolean hasPassword = false;

		private String email;
		private boolean hasEmail = false;


		private Builder() {
		}

		public Builder setUserName(final String userName) {
			this.userName = userName;
			this.hasUserName = true;
			return this;
		}

		public Builder setPassword(final String password) {
			this.password = password;
			this.hasPassword = true;
			return this;
		}

		public Builder setEmail(final String email) {
			this.email = email;
			this.hasEmail = true;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	public String getUserName() {
		return userName;
	}

	public boolean hasUserName() {
		return hasUserName;
	}

	public String getPassword() {
		return password;
	}

	public boolean hasPassword() {
		return hasPassword;
	}

	public String getEmail() {
		return email;
	}

	public boolean hasEmail() {
		return hasEmail;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		if(hasUserName) retValue += "userName = " + this.userName + TAB;
		if(hasPassword) retValue += "password = " + this.password + TAB;
		if(hasEmail) retValue += "email = " + this.email + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	protected int computeSize() {
		int totalSize = 0;
		if(hasUserName) totalSize += ComputeSizeUtil.computeStringSize(fieldNumberUserName, userName);
		if(hasPassword) totalSize += ComputeSizeUtil.computeStringSize(fieldNumberPassword, password);
		if(hasEmail) totalSize += ComputeSizeUtil.computeStringSize(fieldNumberEmail, email);

		return totalSize;
	}

	// Override
	protected void writeFields(final OutputWriter writer) throws IOException {
		if(hasUserName) writer.writeString(fieldNumberUserName, userName);
		if(hasPassword) writer.writeString(fieldNumberPassword, password);
		if(hasEmail) writer.writeString(fieldNumberEmail, email);
		writer.writeData();
	}

	private static User parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = reader.getNextFieldNumber();
		final User.Builder builder = new User.Builder();

		while (nextFieldNumber > 0) {
			switch (nextFieldNumber) {
			case fieldNumberUserName:
				builder.setUserName(reader.readString(nextFieldNumber));
				break;
			case fieldNumberPassword:
				builder.setPassword(reader.readString(nextFieldNumber));
				break;
			case fieldNumberEmail:
				builder.setEmail(reader.readString(nextFieldNumber));
				break;
			default:
				 reader.getPreviousTagDataTypeAndReadContent();
			}

			nextFieldNumber = reader.getNextFieldNumber();
		}

		return builder.build();
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		User.unknownTagHandler = unknownTagHandler;
	}

	public static User parseFrom(final byte[] data) throws IOException {
		return parseFields(JavaMeProtoFactory.createInputUtil(data, unknownTagHandler));
	}

	public static User parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(JavaMeProtoFactory.createInputUtil(inputStream, unknownTagHandler));
	}

	public static User parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(JavaMeProtoFactory.createInputUtil(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}