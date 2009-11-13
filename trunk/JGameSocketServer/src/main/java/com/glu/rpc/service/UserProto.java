// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.glu.rpc.service;

import com.google.protobuf.UninitializedMessageException;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class User extends
      com.google.protobuf.GeneratedMessage {
    // Use User.newBuilder() to construct.
    private User() {}
    
    private static final User defaultInstance = new User();
    public static User getDefaultInstance() {
      return defaultInstance;
    }
    
    public User getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.glu.rpc.service.UserProto.internal_static_com_glu_rpc_service_User_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.glu.rpc.service.UserProto.internal_static_com_glu_rpc_service_User_fieldAccessorTable;
    }
    
    // optional string userName = 1;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean hasUserName;
    private java.lang.String userName_ = "";
    public boolean hasUserName() { return hasUserName; }
    public java.lang.String getUserName() { return userName_; }
    
    // optional string password = 2;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    private boolean hasPassword;
    private java.lang.String password_ = "";
    public boolean hasPassword() { return hasPassword; }
    public java.lang.String getPassword() { return password_; }
    
    // optional string email = 3;
    public static final int EMAIL_FIELD_NUMBER = 3;
    private boolean hasEmail;
    private java.lang.String email_ = "";
    public boolean hasEmail() { return hasEmail; }
    public java.lang.String getEmail() { return email_; }
    
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasUserName()) {
        output.writeString(1, getUserName());
      }
      if (hasPassword()) {
        output.writeString(2, getPassword());
      }
      if (hasEmail()) {
        output.writeString(3, getEmail());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasUserName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getUserName());
      }
      if (hasPassword()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getPassword());
      }
      if (hasEmail()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getEmail());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.glu.rpc.service.UserProto.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.glu.rpc.service.UserProto.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.glu.rpc.service.UserProto.User prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.glu.rpc.service.UserProto.User result;
      
      // Construct using com.glu.rpc.service.UserProto.User.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.glu.rpc.service.UserProto.User();
        return builder;
      }
      
      protected com.glu.rpc.service.UserProto.User internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.glu.rpc.service.UserProto.User();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.glu.rpc.service.UserProto.User.getDescriptor();
      }
      
      public com.glu.rpc.service.UserProto.User getDefaultInstanceForType() {
        return com.glu.rpc.service.UserProto.User.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.glu.rpc.service.UserProto.User build() {
        if (result != null && !isInitialized()) {
          throw new UninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.glu.rpc.service.UserProto.User buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw new UninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.glu.rpc.service.UserProto.User buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.glu.rpc.service.UserProto.User returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.glu.rpc.service.UserProto.User) {
          return mergeFrom((com.glu.rpc.service.UserProto.User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.glu.rpc.service.UserProto.User other) {
        if (other == com.glu.rpc.service.UserProto.User.getDefaultInstance()) return this;
        if (other.hasUserName()) {
          setUserName(other.getUserName());
        }
        if (other.hasPassword()) {
          setPassword(other.getPassword());
        }
        if (other.hasEmail()) {
          setEmail(other.getEmail());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistry extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setUserName(input.readString());
              break;
            }
            case 18: {
              setPassword(input.readString());
              break;
            }
            case 26: {
              setEmail(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string userName = 1;
      public boolean hasUserName() {
        return result.hasUserName();
      }
      public java.lang.String getUserName() {
        return result.getUserName();
      }
      public Builder setUserName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasUserName = true;
        result.userName_ = value;
        return this;
      }
      public Builder clearUserName() {
        result.hasUserName = false;
        result.userName_ = getDefaultInstance().getUserName();
        return this;
      }
      
      // optional string password = 2;
      public boolean hasPassword() {
        return result.hasPassword();
      }
      public java.lang.String getPassword() {
        return result.getPassword();
      }
      public Builder setPassword(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasPassword = true;
        result.password_ = value;
        return this;
      }
      public Builder clearPassword() {
        result.hasPassword = false;
        result.password_ = getDefaultInstance().getPassword();
        return this;
      }
      
      // optional string email = 3;
      public boolean hasEmail() {
        return result.hasEmail();
      }
      public java.lang.String getEmail() {
        return result.getEmail();
      }
      public Builder setEmail(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasEmail = true;
        result.email_ = value;
        return this;
      }
      public Builder clearEmail() {
        result.hasEmail = false;
        result.email_ = getDefaultInstance().getEmail();
        return this;
      }
    }
    
    static {
      com.glu.rpc.service.UserProto.getDescriptor();
    }
    
    static {
      com.glu.rpc.service.UserProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_glu_rpc_service_User_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_glu_rpc_service_User_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String descriptorData = 
      "\n\nuser.proto\022\023com.glu.rpc.service\"9\n\004Use" +
      "r\022\020\n\010userName\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\r\n" +
      "\005email\030\003 \001(\tB\"\n\023com.glu.rpc.serviceB\tUse" +
      "rProtoH\001";
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_glu_rpc_service_User_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_glu_rpc_service_User_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_glu_rpc_service_User_descriptor,
              new java.lang.String[] { "UserName", "Password", "Email", },
              com.glu.rpc.service.UserProto.User.class,
              com.glu.rpc.service.UserProto.User.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
}
