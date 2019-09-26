// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * Protobuf type {@code ClientPageRespBody}
 */
public final class ClientPageRespBody extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:ClientPageRespBody)
		ClientPageRespBodyOrBuilder {
	/**
	 * Protobuf type {@code ClientPageRespBody}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:ClientPageRespBody)
			org.tio.examples.im.common.packets.ClientPageRespBodyOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ClientPageRespBody_descriptor;
		}

		private int bitField0_;

		private int pageIndex_;

		private int pageSize_;

		private int recordCount_;

		private java.util.List<org.tio.examples.im.common.packets.Client> clients_ = java.util.Collections.emptyList();

		private com.google.protobuf.RepeatedFieldBuilderV3<org.tio.examples.im.common.packets.Client, org.tio.examples.im.common.packets.Client.Builder, org.tio.examples.im.common.packets.ClientOrBuilder> clientsBuilder_;

		// Construct using org.tio.examples.im.common.packets.ClientPageRespBody.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder addAllClients(java.lang.Iterable<? extends org.tio.examples.im.common.packets.Client> values) {
			if (clientsBuilder_ == null) {
				ensureClientsIsMutable();
				com.google.protobuf.AbstractMessageLite.Builder.addAll(values, clients_);
				onChanged();
			} else {
				clientsBuilder_.addAllMessages(values);
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder addClients(int index, org.tio.examples.im.common.packets.Client value) {
			if (clientsBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureClientsIsMutable();
				clients_.add(index, value);
				onChanged();
			} else {
				clientsBuilder_.addMessage(index, value);
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder addClients(int index, org.tio.examples.im.common.packets.Client.Builder builderForValue) {
			if (clientsBuilder_ == null) {
				ensureClientsIsMutable();
				clients_.add(index, builderForValue.build());
				onChanged();
			} else {
				clientsBuilder_.addMessage(index, builderForValue.build());
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder addClients(org.tio.examples.im.common.packets.Client value) {
			if (clientsBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureClientsIsMutable();
				clients_.add(value);
				onChanged();
			} else {
				clientsBuilder_.addMessage(value);
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder addClients(org.tio.examples.im.common.packets.Client.Builder builderForValue) {
			if (clientsBuilder_ == null) {
				ensureClientsIsMutable();
				clients_.add(builderForValue.build());
				onChanged();
			} else {
				clientsBuilder_.addMessage(builderForValue.build());
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public org.tio.examples.im.common.packets.Client.Builder addClientsBuilder() {
			return getClientsFieldBuilder().addBuilder(org.tio.examples.im.common.packets.Client.getDefaultInstance());
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public org.tio.examples.im.common.packets.Client.Builder addClientsBuilder(int index) {
			return getClientsFieldBuilder().addBuilder(index, org.tio.examples.im.common.packets.Client.getDefaultInstance());
		}

		@Override
		public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.addRepeatedField(field, value);
		}

		@Override
		public org.tio.examples.im.common.packets.ClientPageRespBody build() {
			org.tio.examples.im.common.packets.ClientPageRespBody result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public org.tio.examples.im.common.packets.ClientPageRespBody buildPartial() {
			org.tio.examples.im.common.packets.ClientPageRespBody result = new org.tio.examples.im.common.packets.ClientPageRespBody(this);
			int from_bitField0_ = bitField0_;
			int to_bitField0_ = 0;
			result.pageIndex_ = pageIndex_;
			result.pageSize_ = pageSize_;
			result.recordCount_ = recordCount_;
			if (clientsBuilder_ == null) {
				if ((bitField0_ & 0x00000008) == 0x00000008) {
					clients_ = java.util.Collections.unmodifiableList(clients_);
					bitField0_ = bitField0_ & ~0x00000008;
				}
				result.clients_ = clients_;
			} else {
				result.clients_ = clientsBuilder_.build();
			}
			result.bitField0_ = to_bitField0_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clear() {
			super.clear();
			pageIndex_ = 0;

			pageSize_ = 0;

			recordCount_ = 0;

			if (clientsBuilder_ == null) {
				clients_ = java.util.Collections.emptyList();
				bitField0_ = bitField0_ & ~0x00000008;
			} else {
				clientsBuilder_.clear();
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder clearClients() {
			if (clientsBuilder_ == null) {
				clients_ = java.util.Collections.emptyList();
				bitField0_ = bitField0_ & ~0x00000008;
				onChanged();
			} else {
				clientsBuilder_.clear();
			}
			return this;
		}

		@Override
		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		@Override
		public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		/**
		 * <pre>
		 *第几页
		 * </pre>
		 *
		 * <code>int32 pageIndex = 1;</code>
		 */
		public Builder clearPageIndex() {

			pageIndex_ = 0;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *每页多少条
		 * </pre>
		 *
		 * <code>int32 pageSize = 2;</code>
		 */
		public Builder clearPageSize() {

			pageSize_ = 0;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *总条数
		 * </pre>
		 *
		 * <code>int32 recordCount = 3;</code>
		 */
		public Builder clearRecordCount() {

			recordCount_ = 0;
			onChanged();
			return this;
		}

		@Override
		public Builder clone() {
			return super.clone();
		}

		private void ensureClientsIsMutable() {
			if (!((bitField0_ & 0x00000008) == 0x00000008)) {
				clients_ = new java.util.ArrayList<>(clients_);
				bitField0_ |= 0x00000008;
			}
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.Client getClients(int index) {
			if (clientsBuilder_ == null) {
				return clients_.get(index);
			} else {
				return clientsBuilder_.getMessage(index);
			}
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public org.tio.examples.im.common.packets.Client.Builder getClientsBuilder(int index) {
			return getClientsFieldBuilder().getBuilder(index);
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public java.util.List<org.tio.examples.im.common.packets.Client.Builder> getClientsBuilderList() {
			return getClientsFieldBuilder().getBuilderList();
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		@Override
		public int getClientsCount() {
			if (clientsBuilder_ == null) {
				return clients_.size();
			} else {
				return clientsBuilder_.getCount();
			}
		}

		private com.google.protobuf.RepeatedFieldBuilderV3<org.tio.examples.im.common.packets.Client, org.tio.examples.im.common.packets.Client.Builder, org.tio.examples.im.common.packets.ClientOrBuilder> getClientsFieldBuilder() {
			if (clientsBuilder_ == null) {
				clientsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<>(
						clients_, (bitField0_ & 0x00000008) == 0x00000008, getParentForChildren(), isClean());
				clients_ = null;
			}
			return clientsBuilder_;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		@Override
		public java.util.List<org.tio.examples.im.common.packets.Client> getClientsList() {
			if (clientsBuilder_ == null) {
				return java.util.Collections.unmodifiableList(clients_);
			} else {
				return clientsBuilder_.getMessageList();
			}
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.ClientOrBuilder getClientsOrBuilder(int index) {
			if (clientsBuilder_ == null) {
				return clients_.get(index);
			} else {
				return clientsBuilder_.getMessageOrBuilder(index);
			}
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		@Override
		public java.util.List<? extends org.tio.examples.im.common.packets.ClientOrBuilder> getClientsOrBuilderList() {
			if (clientsBuilder_ != null) {
				return clientsBuilder_.getMessageOrBuilderList();
			} else {
				return java.util.Collections.unmodifiableList(clients_);
			}
		}

		@Override
		public org.tio.examples.im.common.packets.ClientPageRespBody getDefaultInstanceForType() {
			return org.tio.examples.im.common.packets.ClientPageRespBody.getDefaultInstance();
		}

		@Override
		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ClientPageRespBody_descriptor;
		}

		/**
		 * <pre>
		 *第几页
		 * </pre>
		 *
		 * <code>int32 pageIndex = 1;</code>
		 */
		@Override
		public int getPageIndex() {
			return pageIndex_;
		}

		/**
		 * <pre>
		 *每页多少条
		 * </pre>
		 *
		 * <code>int32 pageSize = 2;</code>
		 */
		@Override
		public int getPageSize() {
			return pageSize_;
		}

		/**
		 * <pre>
		 *总条数
		 * </pre>
		 *
		 * <code>int32 recordCount = 3;</code>
		 */
		@Override
		public int getRecordCount() {
			return recordCount_;
		}

		@Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ClientPageRespBody_fieldAccessorTable.ensureFieldAccessorsInitialized(
					org.tio.examples.im.common.packets.ClientPageRespBody.class, org.tio.examples.im.common.packets.ClientPageRespBody.Builder.class);
		}

		@Override
		public final boolean isInitialized() {
			return true;
		}

		private void maybeForceBuilderInitialization() {
			if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
				getClientsFieldBuilder();
			}
		}

		@Override
		public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			org.tio.examples.im.common.packets.ClientPageRespBody parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (org.tio.examples.im.common.packets.ClientPageRespBody) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		@Override
		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof org.tio.examples.im.common.packets.ClientPageRespBody) {
				return mergeFrom((org.tio.examples.im.common.packets.ClientPageRespBody) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.tio.examples.im.common.packets.ClientPageRespBody other) {
			if (other == org.tio.examples.im.common.packets.ClientPageRespBody.getDefaultInstance()) {
				return this;
			}
			if (other.getPageIndex() != 0) {
				setPageIndex(other.getPageIndex());
			}
			if (other.getPageSize() != 0) {
				setPageSize(other.getPageSize());
			}
			if (other.getRecordCount() != 0) {
				setRecordCount(other.getRecordCount());
			}
			if (clientsBuilder_ == null) {
				if (!other.clients_.isEmpty()) {
					if (clients_.isEmpty()) {
						clients_ = other.clients_;
						bitField0_ = bitField0_ & ~0x00000008;
					} else {
						ensureClientsIsMutable();
						clients_.addAll(other.clients_);
					}
					onChanged();
				}
			} else {
				if (!other.clients_.isEmpty()) {
					if (clientsBuilder_.isEmpty()) {
						clientsBuilder_.dispose();
						clientsBuilder_ = null;
						clients_ = other.clients_;
						bitField0_ = bitField0_ & ~0x00000008;
						clientsBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getClientsFieldBuilder() : null;
					} else {
						clientsBuilder_.addAllMessages(other.clients_);
					}
				}
			}
			onChanged();
			return this;
		}

		@Override
		public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder removeClients(int index) {
			if (clientsBuilder_ == null) {
				ensureClientsIsMutable();
				clients_.remove(index);
				onChanged();
			} else {
				clientsBuilder_.remove(index);
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder setClients(int index, org.tio.examples.im.common.packets.Client value) {
			if (clientsBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureClientsIsMutable();
				clients_.set(index, value);
				onChanged();
			} else {
				clientsBuilder_.setMessage(index, value);
			}
			return this;
		}

		/**
		 * <pre>
		 * </pre>
		 *
		 * <code>repeated .Client clients = 4;</code>
		 */
		public Builder setClients(int index, org.tio.examples.im.common.packets.Client.Builder builderForValue) {
			if (clientsBuilder_ == null) {
				ensureClientsIsMutable();
				clients_.set(index, builderForValue.build());
				onChanged();
			} else {
				clientsBuilder_.setMessage(index, builderForValue.build());
			}
			return this;
		}

		@Override
		public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.setField(field, value);
		}

		/**
		 * <pre>
		 *第几页
		 * </pre>
		 *
		 * <code>int32 pageIndex = 1;</code>
		 */
		public Builder setPageIndex(int value) {

			pageIndex_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *每页多少条
		 * </pre>
		 *
		 * <code>int32 pageSize = 2;</code>
		 */
		public Builder setPageSize(int value) {

			pageSize_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *总条数
		 * </pre>
		 *
		 * <code>int32 recordCount = 3;</code>
		 */
		public Builder setRecordCount(int value) {

			recordCount_ = value;
			onChanged();
			return this;
		}

		@Override
		public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
			return super.setRepeatedField(field, index, value);
		}

		@Override
		public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		// @@protoc_insertion_point(builder_scope:ClientPageRespBody)
	}

	public static final int PAGEINDEX_FIELD_NUMBER = 1;

	public static final int PAGESIZE_FIELD_NUMBER = 2;

	public static final int RECORDCOUNT_FIELD_NUMBER = 3;

	public static final int CLIENTS_FIELD_NUMBER = 4;

	private static final long serialVersionUID = 0L;

	// @@protoc_insertion_point(class_scope:ClientPageRespBody)
	private static final org.tio.examples.im.common.packets.ClientPageRespBody DEFAULT_INSTANCE;
	static {
		DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.ClientPageRespBody();
	}
	private static final com.google.protobuf.Parser<ClientPageRespBody> PARSER = new com.google.protobuf.AbstractParser<ClientPageRespBody>() {
		@Override
		public ClientPageRespBody parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new ClientPageRespBody(input, extensionRegistry);
		}
	};

	public static org.tio.examples.im.common.packets.ClientPageRespBody getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return org.tio.examples.im.common.packets.Chat.internal_static_ClientPageRespBody_descriptor;
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.tio.examples.im.common.packets.ClientPageRespBody prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ClientPageRespBody parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.protobuf.Parser<ClientPageRespBody> parser() {
		return PARSER;
	}

	private int bitField0_;

	private int pageIndex_;

	private int pageSize_;

	private int recordCount_;

	private java.util.List<org.tio.examples.im.common.packets.Client> clients_;

	private byte memoizedIsInitialized = -1;

	private ClientPageRespBody() {
		pageIndex_ = 0;
		pageSize_ = 0;
		recordCount_ = 0;
		clients_ = java.util.Collections.emptyList();
	}

	private ClientPageRespBody(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
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

					pageIndex_ = input.readInt32();
					break;
				}
				case 16: {

					pageSize_ = input.readInt32();
					break;
				}
				case 24: {

					recordCount_ = input.readInt32();
					break;
				}
				case 34: {
					if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
						clients_ = new java.util.ArrayList<>();
						mutable_bitField0_ |= 0x00000008;
					}
					clients_.add(input.readMessage(org.tio.examples.im.common.packets.Client.parser(), extensionRegistry));
					break;
				}
				}
			}
		} catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			if ((mutable_bitField0_ & 0x00000008) == 0x00000008) {
				clients_ = java.util.Collections.unmodifiableList(clients_);
			}
			makeExtensionsImmutable();
		}
	}

	// Use ClientPageRespBody.newBuilder() to construct.
	private ClientPageRespBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.tio.examples.im.common.packets.ClientPageRespBody)) {
			return super.equals(obj);
		}
		org.tio.examples.im.common.packets.ClientPageRespBody other = (org.tio.examples.im.common.packets.ClientPageRespBody) obj;

		boolean result = true;
		result = result && getPageIndex() == other.getPageIndex();
		result = result && getPageSize() == other.getPageSize();
		result = result && getRecordCount() == other.getRecordCount();
		result = result && getClientsList().equals(other.getClientsList());
		return result;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * <code>repeated .Client clients = 4;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.Client getClients(int index) {
		return clients_.get(index);
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * <code>repeated .Client clients = 4;</code>
	 */
	@Override
	public int getClientsCount() {
		return clients_.size();
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * <code>repeated .Client clients = 4;</code>
	 */
	@Override
	public java.util.List<org.tio.examples.im.common.packets.Client> getClientsList() {
		return clients_;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * <code>repeated .Client clients = 4;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.ClientOrBuilder getClientsOrBuilder(int index) {
		return clients_.get(index);
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * <code>repeated .Client clients = 4;</code>
	 */
	@Override
	public java.util.List<? extends org.tio.examples.im.common.packets.ClientOrBuilder> getClientsOrBuilderList() {
		return clients_;
	}

	@Override
	public org.tio.examples.im.common.packets.ClientPageRespBody getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

	/**
	 * <pre>
	 *第几页
	 * </pre>
	 *
	 * <code>int32 pageIndex = 1;</code>
	 */
	@Override
	public int getPageIndex() {
		return pageIndex_;
	}

	/**
	 * <pre>
	 *每页多少条
	 * </pre>
	 *
	 * <code>int32 pageSize = 2;</code>
	 */
	@Override
	public int getPageSize() {
		return pageSize_;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<ClientPageRespBody> getParserForType() {
		return PARSER;
	}

	/**
	 * <pre>
	 *总条数
	 * </pre>
	 *
	 * <code>int32 recordCount = 3;</code>
	 */
	@Override
	public int getRecordCount() {
		return recordCount_;
	}

	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) {
			return size;
		}

		size = 0;
		if (pageIndex_ != 0) {
			size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, pageIndex_);
		}
		if (pageSize_ != 0) {
			size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, pageSize_);
		}
		if (recordCount_ != 0) {
			size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, recordCount_);
		}
		for (int i = 0; i < clients_.size(); i++) {
			size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, clients_.get(i));
		}
		memoizedSize = size;
		return size;
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
		return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
	}

	@java.lang.Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = 19 * hash + getDescriptor().hashCode();
		hash = 37 * hash + PAGEINDEX_FIELD_NUMBER;
		hash = 53 * hash + getPageIndex();
		hash = 37 * hash + PAGESIZE_FIELD_NUMBER;
		hash = 53 * hash + getPageSize();
		hash = 37 * hash + RECORDCOUNT_FIELD_NUMBER;
		hash = 53 * hash + getRecordCount();
		if (getClientsCount() > 0) {
			hash = 37 * hash + CLIENTS_FIELD_NUMBER;
			hash = 53 * hash + getClientsList().hashCode();
		}
		hash = 29 * hash + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	@Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return org.tio.examples.im.common.packets.Chat.internal_static_ClientPageRespBody_fieldAccessorTable
				.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.ClientPageRespBody.class, org.tio.examples.im.common.packets.ClientPageRespBody.Builder.class);
	}

	@Override
	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1) {
			return true;
		}
		if (isInitialized == 0) {
			return false;
		}

		memoizedIsInitialized = 1;
		return true;
	}

	@Override
	public Builder newBuilderForType() {
		return newBuilder();
	}

	@java.lang.Override
	protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	@Override
	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}

	@Override
	public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
		if (pageIndex_ != 0) {
			output.writeInt32(1, pageIndex_);
		}
		if (pageSize_ != 0) {
			output.writeInt32(2, pageSize_);
		}
		if (recordCount_ != 0) {
			output.writeInt32(3, recordCount_);
		}
		for (int i = 0; i < clients_.size(); i++) {
			output.writeMessage(4, clients_.get(i));
		}
	}

}
