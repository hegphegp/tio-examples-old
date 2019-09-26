// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * <pre>
 **
 * 开始直播请求
 * </pre>
 *
 * Protobuf type {@code BeginToLiveReqBody}
 */
public  final class BeginToLiveReqBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BeginToLiveReqBody)
    BeginToLiveReqBodyOrBuilder {
  // Use BeginToLiveReqBody.newBuilder() to construct.
  private BeginToLiveReqBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BeginToLiveReqBody() {
    time_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BeginToLiveReqBody(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            time_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tio.examples.im.common.packets.Chat.internal_static_BeginToLiveReqBody_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tio.examples.im.common.packets.Chat.internal_static_BeginToLiveReqBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tio.examples.im.common.packets.BeginToLiveReqBody.class, org.tio.examples.im.common.packets.BeginToLiveReqBody.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;
  /**
   * <pre>
   *消息发送时间
   * </pre>
   *
   * <code>int64 time = 1;</code>
   */
  public long getTime() {
    return time_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, time_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tio.examples.im.common.packets.BeginToLiveReqBody)) {
      return super.equals(obj);
    }
    org.tio.examples.im.common.packets.BeginToLiveReqBody other = (org.tio.examples.im.common.packets.BeginToLiveReqBody) obj;

    boolean result = true;
    result = result && (getTime()
        == other.getTime());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tio.examples.im.common.packets.BeginToLiveReqBody parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tio.examples.im.common.packets.BeginToLiveReqBody prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * 开始直播请求
   * </pre>
   *
   * Protobuf type {@code BeginToLiveReqBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BeginToLiveReqBody)
      org.tio.examples.im.common.packets.BeginToLiveReqBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tio.examples.im.common.packets.Chat.internal_static_BeginToLiveReqBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tio.examples.im.common.packets.Chat.internal_static_BeginToLiveReqBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tio.examples.im.common.packets.BeginToLiveReqBody.class, org.tio.examples.im.common.packets.BeginToLiveReqBody.Builder.class);
    }

    // Construct using org.tio.examples.im.common.packets.BeginToLiveReqBody.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      time_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tio.examples.im.common.packets.Chat.internal_static_BeginToLiveReqBody_descriptor;
    }

    public org.tio.examples.im.common.packets.BeginToLiveReqBody getDefaultInstanceForType() {
      return org.tio.examples.im.common.packets.BeginToLiveReqBody.getDefaultInstance();
    }

    public org.tio.examples.im.common.packets.BeginToLiveReqBody build() {
      org.tio.examples.im.common.packets.BeginToLiveReqBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tio.examples.im.common.packets.BeginToLiveReqBody buildPartial() {
      org.tio.examples.im.common.packets.BeginToLiveReqBody result = new org.tio.examples.im.common.packets.BeginToLiveReqBody(this);
      result.time_ = time_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tio.examples.im.common.packets.BeginToLiveReqBody) {
        return mergeFrom((org.tio.examples.im.common.packets.BeginToLiveReqBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tio.examples.im.common.packets.BeginToLiveReqBody other) {
      if (other == org.tio.examples.im.common.packets.BeginToLiveReqBody.getDefaultInstance()) return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tio.examples.im.common.packets.BeginToLiveReqBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tio.examples.im.common.packets.BeginToLiveReqBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long time_ ;
    /**
     * <pre>
     *消息发送时间
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <pre>
     *消息发送时间
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *消息发送时间
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:BeginToLiveReqBody)
  }

  // @@protoc_insertion_point(class_scope:BeginToLiveReqBody)
  private static final org.tio.examples.im.common.packets.BeginToLiveReqBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.BeginToLiveReqBody();
  }

  public static org.tio.examples.im.common.packets.BeginToLiveReqBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BeginToLiveReqBody>
      PARSER = new com.google.protobuf.AbstractParser<BeginToLiveReqBody>() {
    public BeginToLiveReqBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BeginToLiveReqBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BeginToLiveReqBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BeginToLiveReqBody> getParserForType() {
    return PARSER;
  }

  public org.tio.examples.im.common.packets.BeginToLiveReqBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

