// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/saved_object_graph.proto

package org.tensorflow.proto.framework;

/**
 * <pre>
 * A SavedUserObject is an object (in the object-oriented language of the
 * TensorFlow program) of some user- or framework-defined class other than
 * those handled specifically by the other kinds of SavedObjects.
 * This object cannot be evaluated as a tensor, and therefore cannot be bound
 * to an input of a function.
 * </pre>
 *
 * Protobuf type {@code tensorflow.SavedUserObject}
 */
public  final class SavedUserObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.SavedUserObject)
    SavedUserObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SavedUserObject.newBuilder() to construct.
  private SavedUserObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SavedUserObject() {
    identifier_ = "";
    metadata_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SavedUserObject();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SavedUserObject(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            identifier_ = s;
            break;
          }
          case 18: {
            org.tensorflow.proto.framework.VersionDef.Builder subBuilder = null;
            if (version_ != null) {
              subBuilder = version_.toBuilder();
            }
            version_ = input.readMessage(org.tensorflow.proto.framework.VersionDef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(version_);
              version_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            metadata_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_SavedUserObject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_SavedUserObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.framework.SavedUserObject.class, org.tensorflow.proto.framework.SavedUserObject.Builder.class);
  }

  public static final int IDENTIFIER_FIELD_NUMBER = 1;
  private volatile java.lang.Object identifier_;
  /**
   * <pre>
   * Corresponds to a registration of the type to use in the loading program.
   * </pre>
   *
   * <code>string identifier = 1;</code>
   */
  public java.lang.String getIdentifier() {
    java.lang.Object ref = identifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identifier_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Corresponds to a registration of the type to use in the loading program.
   * </pre>
   *
   * <code>string identifier = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdentifierBytes() {
    java.lang.Object ref = identifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private org.tensorflow.proto.framework.VersionDef version_;
  /**
   * <pre>
   * Version information from the producer of this SavedUserObject.
   * </pre>
   *
   * <code>.tensorflow.VersionDef version = 2;</code>
   */
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <pre>
   * Version information from the producer of this SavedUserObject.
   * </pre>
   *
   * <code>.tensorflow.VersionDef version = 2;</code>
   */
  public org.tensorflow.proto.framework.VersionDef getVersion() {
    return version_ == null ? org.tensorflow.proto.framework.VersionDef.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * Version information from the producer of this SavedUserObject.
   * </pre>
   *
   * <code>.tensorflow.VersionDef version = 2;</code>
   */
  public org.tensorflow.proto.framework.VersionDefOrBuilder getVersionOrBuilder() {
    return getVersion();
  }

  public static final int METADATA_FIELD_NUMBER = 3;
  private volatile java.lang.Object metadata_;
  /**
   * <pre>
   * Initialization-related metadata.
   * </pre>
   *
   * <code>string metadata = 3;</code>
   */
  public java.lang.String getMetadata() {
    java.lang.Object ref = metadata_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadata_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Initialization-related metadata.
   * </pre>
   *
   * <code>string metadata = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMetadataBytes() {
    java.lang.Object ref = metadata_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metadata_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdentifierBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identifier_);
    }
    if (version_ != null) {
      output.writeMessage(2, getVersion());
    }
    if (!getMetadataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, metadata_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdentifierBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identifier_);
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVersion());
    }
    if (!getMetadataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, metadata_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.framework.SavedUserObject)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.framework.SavedUserObject other = (org.tensorflow.proto.framework.SavedUserObject) obj;

    if (!getIdentifier()
        .equals(other.getIdentifier())) return false;
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (!getMetadata()
        .equals(other.getMetadata())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getIdentifier().hashCode();
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.SavedUserObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.proto.framework.SavedUserObject prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * A SavedUserObject is an object (in the object-oriented language of the
   * TensorFlow program) of some user- or framework-defined class other than
   * those handled specifically by the other kinds of SavedObjects.
   * This object cannot be evaluated as a tensor, and therefore cannot be bound
   * to an input of a function.
   * </pre>
   *
   * Protobuf type {@code tensorflow.SavedUserObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.SavedUserObject)
      org.tensorflow.proto.framework.SavedUserObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_SavedUserObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_SavedUserObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.framework.SavedUserObject.class, org.tensorflow.proto.framework.SavedUserObject.Builder.class);
    }

    // Construct using org.tensorflow.proto.framework.SavedUserObject.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      identifier_ = "";

      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      metadata_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_SavedUserObject_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.SavedUserObject getDefaultInstanceForType() {
      return org.tensorflow.proto.framework.SavedUserObject.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.SavedUserObject build() {
      org.tensorflow.proto.framework.SavedUserObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.SavedUserObject buildPartial() {
      org.tensorflow.proto.framework.SavedUserObject result = new org.tensorflow.proto.framework.SavedUserObject(this);
      result.identifier_ = identifier_;
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
      }
      result.metadata_ = metadata_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.proto.framework.SavedUserObject) {
        return mergeFrom((org.tensorflow.proto.framework.SavedUserObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.framework.SavedUserObject other) {
      if (other == org.tensorflow.proto.framework.SavedUserObject.getDefaultInstance()) return this;
      if (!other.getIdentifier().isEmpty()) {
        identifier_ = other.identifier_;
        onChanged();
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (!other.getMetadata().isEmpty()) {
        metadata_ = other.metadata_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.proto.framework.SavedUserObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.framework.SavedUserObject) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object identifier_ = "";
    /**
     * <pre>
     * Corresponds to a registration of the type to use in the loading program.
     * </pre>
     *
     * <code>string identifier = 1;</code>
     */
    public java.lang.String getIdentifier() {
      java.lang.Object ref = identifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Corresponds to a registration of the type to use in the loading program.
     * </pre>
     *
     * <code>string identifier = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      java.lang.Object ref = identifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Corresponds to a registration of the type to use in the loading program.
     * </pre>
     *
     * <code>string identifier = 1;</code>
     */
    public Builder setIdentifier(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to a registration of the type to use in the loading program.
     * </pre>
     *
     * <code>string identifier = 1;</code>
     */
    public Builder clearIdentifier() {
      
      identifier_ = getDefaultInstance().getIdentifier();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponds to a registration of the type to use in the loading program.
     * </pre>
     *
     * <code>string identifier = 1;</code>
     */
    public Builder setIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identifier_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.proto.framework.VersionDef version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.VersionDef, org.tensorflow.proto.framework.VersionDef.Builder, org.tensorflow.proto.framework.VersionDefOrBuilder> versionBuilder_;
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public org.tensorflow.proto.framework.VersionDef getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? org.tensorflow.proto.framework.VersionDef.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public Builder setVersion(org.tensorflow.proto.framework.VersionDef value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public Builder setVersion(
        org.tensorflow.proto.framework.VersionDef.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public Builder mergeVersion(org.tensorflow.proto.framework.VersionDef value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ =
            org.tensorflow.proto.framework.VersionDef.newBuilder(version_).mergeFrom(value).buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public org.tensorflow.proto.framework.VersionDef.Builder getVersionBuilder() {
      
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    public org.tensorflow.proto.framework.VersionDefOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            org.tensorflow.proto.framework.VersionDef.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * Version information from the producer of this SavedUserObject.
     * </pre>
     *
     * <code>.tensorflow.VersionDef version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.VersionDef, org.tensorflow.proto.framework.VersionDef.Builder, org.tensorflow.proto.framework.VersionDefOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.framework.VersionDef, org.tensorflow.proto.framework.VersionDef.Builder, org.tensorflow.proto.framework.VersionDefOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private java.lang.Object metadata_ = "";
    /**
     * <pre>
     * Initialization-related metadata.
     * </pre>
     *
     * <code>string metadata = 3;</code>
     */
    public java.lang.String getMetadata() {
      java.lang.Object ref = metadata_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadata_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Initialization-related metadata.
     * </pre>
     *
     * <code>string metadata = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMetadataBytes() {
      java.lang.Object ref = metadata_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metadata_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Initialization-related metadata.
     * </pre>
     *
     * <code>string metadata = 3;</code>
     */
    public Builder setMetadata(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      metadata_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Initialization-related metadata.
     * </pre>
     *
     * <code>string metadata = 3;</code>
     */
    public Builder clearMetadata() {
      
      metadata_ = getDefaultInstance().getMetadata();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Initialization-related metadata.
     * </pre>
     *
     * <code>string metadata = 3;</code>
     */
    public Builder setMetadataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      metadata_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.SavedUserObject)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.SavedUserObject)
  private static final org.tensorflow.proto.framework.SavedUserObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.framework.SavedUserObject();
  }

  public static org.tensorflow.proto.framework.SavedUserObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SavedUserObject>
      PARSER = new com.google.protobuf.AbstractParser<SavedUserObject>() {
    @java.lang.Override
    public SavedUserObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SavedUserObject(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SavedUserObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SavedUserObject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.framework.SavedUserObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

