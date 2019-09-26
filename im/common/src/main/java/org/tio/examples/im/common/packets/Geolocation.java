// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * <pre>
 **
 * 地图定位
 * </pre>
 *
 * Protobuf type {@code Geolocation}
 */
public final class Geolocation extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:Geolocation)
		GeolocationOrBuilder {
	/**
	 * <pre>
	 **
	 * 地图定位
	 * </pre>
	 *
	 * Protobuf type {@code Geolocation}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:Geolocation)
			org.tio.examples.im.common.packets.GeolocationOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.tio.examples.im.common.packets.Chat.internal_static_Geolocation_descriptor;
		}

		private double lng_;

		private double lat_;

		// Construct using org.tio.examples.im.common.packets.Geolocation.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		@Override
		public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.addRepeatedField(field, value);
		}

		@Override
		public org.tio.examples.im.common.packets.Geolocation build() {
			org.tio.examples.im.common.packets.Geolocation result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public org.tio.examples.im.common.packets.Geolocation buildPartial() {
			org.tio.examples.im.common.packets.Geolocation result = new org.tio.examples.im.common.packets.Geolocation(this);
			result.lng_ = lng_;
			result.lat_ = lat_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clear() {
			super.clear();
			lng_ = 0D;

			lat_ = 0D;

			return this;
		}

		@Override
		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		/**
		 * <pre>
		 *纬度
		 * </pre>
		 *
		 * <code>double lat = 2;</code>
		 */
		public Builder clearLat() {

			lat_ = 0D;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *lng、lat分别代表经度、纬度值
		 * </pre>
		 *
		 * <code>double lng = 1;</code>
		 */
		public Builder clearLng() {

			lng_ = 0D;
			onChanged();
			return this;
		}

		@Override
		public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		@Override
		public Builder clone() {
			return super.clone();
		}

		@Override
		public org.tio.examples.im.common.packets.Geolocation getDefaultInstanceForType() {
			return org.tio.examples.im.common.packets.Geolocation.getDefaultInstance();
		}

		@Override
		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return org.tio.examples.im.common.packets.Chat.internal_static_Geolocation_descriptor;
		}

		/**
		 * <pre>
		 *纬度
		 * </pre>
		 *
		 * <code>double lat = 2;</code>
		 */
		@Override
		public double getLat() {
			return lat_;
		}

		/**
		 * <pre>
		 *lng、lat分别代表经度、纬度值
		 * </pre>
		 *
		 * <code>double lng = 1;</code>
		 */
		@Override
		public double getLng() {
			return lng_;
		}

		@Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return org.tio.examples.im.common.packets.Chat.internal_static_Geolocation_fieldAccessorTable
					.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.Geolocation.class, org.tio.examples.im.common.packets.Geolocation.Builder.class);
		}

		@Override
		public final boolean isInitialized() {
			return true;
		}

		private void maybeForceBuilderInitialization() {
			if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
			}
		}

		@Override
		public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			org.tio.examples.im.common.packets.Geolocation parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (org.tio.examples.im.common.packets.Geolocation) e.getUnfinishedMessage();
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
			if (other instanceof org.tio.examples.im.common.packets.Geolocation) {
				return mergeFrom((org.tio.examples.im.common.packets.Geolocation) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.tio.examples.im.common.packets.Geolocation other) {
			if (other == org.tio.examples.im.common.packets.Geolocation.getDefaultInstance()) {
				return this;
			}
			if (other.getLng() != 0D) {
				setLng(other.getLng());
			}
			if (other.getLat() != 0D) {
				setLat(other.getLat());
			}
			onChanged();
			return this;
		}

		@Override
		public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		@Override
		public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.setField(field, value);
		}

		/**
		 * <pre>
		 *纬度
		 * </pre>
		 *
		 * <code>double lat = 2;</code>
		 */
		public Builder setLat(double value) {

			lat_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *lng、lat分别代表经度、纬度值
		 * </pre>
		 *
		 * <code>double lng = 1;</code>
		 */
		public Builder setLng(double value) {

			lng_ = value;
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

		// @@protoc_insertion_point(builder_scope:Geolocation)
	}

	public static final int LNG_FIELD_NUMBER = 1;

	public static final int LAT_FIELD_NUMBER = 2;

	private static final long serialVersionUID = 0L;

	// @@protoc_insertion_point(class_scope:Geolocation)
	private static final org.tio.examples.im.common.packets.Geolocation DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.Geolocation();
	}

	private static final com.google.protobuf.Parser<Geolocation> PARSER = new com.google.protobuf.AbstractParser<Geolocation>() {
		@Override
		public Geolocation parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new Geolocation(input, extensionRegistry);
		}
	};

	public static org.tio.examples.im.common.packets.Geolocation getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return org.tio.examples.im.common.packets.Chat.internal_static_Geolocation_descriptor;
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.tio.examples.im.common.packets.Geolocation prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.Geolocation parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.protobuf.Parser<Geolocation> parser() {
		return PARSER;
	}

	private double lng_;

	private double lat_;

	private byte memoizedIsInitialized = -1;

	private Geolocation() {
		lng_ = 0D;
		lat_ = 0D;
	}

	private Geolocation(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
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
				case 9: {

					lng_ = input.readDouble();
					break;
				}
				case 17: {

					lat_ = input.readDouble();
					break;
				}
				}
			}
		} catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			makeExtensionsImmutable();
		}
	}

	// Use Geolocation.newBuilder() to construct.
	private Geolocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.tio.examples.im.common.packets.Geolocation)) {
			return super.equals(obj);
		}
		org.tio.examples.im.common.packets.Geolocation other = (org.tio.examples.im.common.packets.Geolocation) obj;

		boolean result = true;
		result = result && java.lang.Double.doubleToLongBits(getLng()) == java.lang.Double.doubleToLongBits(other.getLng());
		result = result && java.lang.Double.doubleToLongBits(getLat()) == java.lang.Double.doubleToLongBits(other.getLat());
		return result;
	}

	@Override
	public org.tio.examples.im.common.packets.Geolocation getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

	/**
	 * <pre>
	 *纬度
	 * </pre>
	 *
	 * <code>double lat = 2;</code>
	 */
	@Override
	public double getLat() {
		return lat_;
	}

	/**
	 * <pre>
	 *lng、lat分别代表经度、纬度值
	 * </pre>
	 *
	 * <code>double lng = 1;</code>
	 */
	@Override
	public double getLng() {
		return lng_;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<Geolocation> getParserForType() {
		return PARSER;
	}

	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) {
			return size;
		}

		size = 0;
		if (lng_ != 0D) {
			size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, lng_);
		}
		if (lat_ != 0D) {
			size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, lat_);
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
		hash = 37 * hash + LNG_FIELD_NUMBER;
		hash = 53 * hash + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getLng()));
		hash = 37 * hash + LAT_FIELD_NUMBER;
		hash = 53 * hash + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getLat()));
		hash = 29 * hash + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	@Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return org.tio.examples.im.common.packets.Chat.internal_static_Geolocation_fieldAccessorTable
				.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.Geolocation.class, org.tio.examples.im.common.packets.Geolocation.Builder.class);
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
		if (lng_ != 0D) {
			output.writeDouble(1, lng_);
		}
		if (lat_ != 0D) {
			output.writeDouble(2, lat_);
		}
	}

}
