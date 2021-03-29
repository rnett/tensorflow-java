// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example_parser_configuration.proto

package org.tensorflow.proto.example;

/**
 * Protobuf type {@code tensorflow.ExampleParserConfiguration}
 */
public  final class ExampleParserConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ExampleParserConfiguration)
    ExampleParserConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExampleParserConfiguration.newBuilder() to construct.
  private ExampleParserConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExampleParserConfiguration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExampleParserConfiguration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExampleParserConfiguration(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              featureMap_ = com.google.protobuf.MapField.newMapField(
                  FeatureMapDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration>
            featureMap__ = input.readMessage(
                FeatureMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            featureMap_.getMutableMap().put(
                featureMap__.getKey(), featureMap__.getValue());
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
    return org.tensorflow.proto.example.ExampleParserConfigurationProtos.internal_static_tensorflow_ExampleParserConfiguration_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetFeatureMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.example.ExampleParserConfigurationProtos.internal_static_tensorflow_ExampleParserConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.example.ExampleParserConfiguration.class, org.tensorflow.proto.example.ExampleParserConfiguration.Builder.class);
  }

  public static final int FEATURE_MAP_FIELD_NUMBER = 1;
  private static final class FeatureMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration>newDefaultInstance(
                org.tensorflow.proto.example.ExampleParserConfigurationProtos.internal_static_tensorflow_ExampleParserConfiguration_FeatureMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.tensorflow.proto.example.FeatureConfiguration.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> featureMap_;
  private com.google.protobuf.MapField<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration>
  internalGetFeatureMap() {
    if (featureMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FeatureMapDefaultEntryHolder.defaultEntry);
    }
    return featureMap_;
  }

  public int getFeatureMapCount() {
    return internalGetFeatureMap().getMap().size();
  }
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */

  public boolean containsFeatureMap(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetFeatureMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFeatureMapMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> getFeatureMap() {
    return getFeatureMapMap();
  }
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */

  public java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> getFeatureMapMap() {
    return internalGetFeatureMap().getMap();
  }
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */

  public org.tensorflow.proto.example.FeatureConfiguration getFeatureMapOrDefault(
      java.lang.String key,
      org.tensorflow.proto.example.FeatureConfiguration defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> map =
        internalGetFeatureMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */

  public org.tensorflow.proto.example.FeatureConfiguration getFeatureMapOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> map =
        internalGetFeatureMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetFeatureMap(),
        FeatureMapDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> entry
         : internalGetFeatureMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration>
      featureMap__ = FeatureMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, featureMap__);
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
    if (!(obj instanceof org.tensorflow.proto.example.ExampleParserConfiguration)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.example.ExampleParserConfiguration other = (org.tensorflow.proto.example.ExampleParserConfiguration) obj;

    if (!internalGetFeatureMap().equals(
        other.internalGetFeatureMap())) return false;
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
    if (!internalGetFeatureMap().getMap().isEmpty()) {
      hash = (37 * hash) + FEATURE_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFeatureMap().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.example.ExampleParserConfiguration parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.example.ExampleParserConfiguration prototype) {
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
   * Protobuf type {@code tensorflow.ExampleParserConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ExampleParserConfiguration)
      org.tensorflow.proto.example.ExampleParserConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.example.ExampleParserConfigurationProtos.internal_static_tensorflow_ExampleParserConfiguration_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetFeatureMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableFeatureMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.example.ExampleParserConfigurationProtos.internal_static_tensorflow_ExampleParserConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.example.ExampleParserConfiguration.class, org.tensorflow.proto.example.ExampleParserConfiguration.Builder.class);
    }

    // Construct using org.tensorflow.proto.example.ExampleParserConfiguration.newBuilder()
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
      internalGetMutableFeatureMap().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.example.ExampleParserConfigurationProtos.internal_static_tensorflow_ExampleParserConfiguration_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.example.ExampleParserConfiguration getDefaultInstanceForType() {
      return org.tensorflow.proto.example.ExampleParserConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.example.ExampleParserConfiguration build() {
      org.tensorflow.proto.example.ExampleParserConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.example.ExampleParserConfiguration buildPartial() {
      org.tensorflow.proto.example.ExampleParserConfiguration result = new org.tensorflow.proto.example.ExampleParserConfiguration(this);
      int from_bitField0_ = bitField0_;
      result.featureMap_ = internalGetFeatureMap();
      result.featureMap_.makeImmutable();
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
      if (other instanceof org.tensorflow.proto.example.ExampleParserConfiguration) {
        return mergeFrom((org.tensorflow.proto.example.ExampleParserConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.example.ExampleParserConfiguration other) {
      if (other == org.tensorflow.proto.example.ExampleParserConfiguration.getDefaultInstance()) return this;
      internalGetMutableFeatureMap().mergeFrom(
          other.internalGetFeatureMap());
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
      org.tensorflow.proto.example.ExampleParserConfiguration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.example.ExampleParserConfiguration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> featureMap_;
    private com.google.protobuf.MapField<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration>
    internalGetFeatureMap() {
      if (featureMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FeatureMapDefaultEntryHolder.defaultEntry);
      }
      return featureMap_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration>
    internalGetMutableFeatureMap() {
      onChanged();;
      if (featureMap_ == null) {
        featureMap_ = com.google.protobuf.MapField.newMapField(
            FeatureMapDefaultEntryHolder.defaultEntry);
      }
      if (!featureMap_.isMutable()) {
        featureMap_ = featureMap_.copy();
      }
      return featureMap_;
    }

    public int getFeatureMapCount() {
      return internalGetFeatureMap().getMap().size();
    }
    /**
     * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
     */

    public boolean containsFeatureMap(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetFeatureMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFeatureMapMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> getFeatureMap() {
      return getFeatureMapMap();
    }
    /**
     * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
     */

    public java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> getFeatureMapMap() {
      return internalGetFeatureMap().getMap();
    }
    /**
     * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
     */

    public org.tensorflow.proto.example.FeatureConfiguration getFeatureMapOrDefault(
        java.lang.String key,
        org.tensorflow.proto.example.FeatureConfiguration defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> map =
          internalGetFeatureMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
     */

    public org.tensorflow.proto.example.FeatureConfiguration getFeatureMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> map =
          internalGetFeatureMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFeatureMap() {
      internalGetMutableFeatureMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
     */

    public Builder removeFeatureMap(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFeatureMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration>
    getMutableFeatureMap() {
      return internalGetMutableFeatureMap().getMutableMap();
    }
    /**
     * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
     */
    public Builder putFeatureMap(
        java.lang.String key,
        org.tensorflow.proto.example.FeatureConfiguration value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFeatureMap().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
     */

    public Builder putAllFeatureMap(
        java.util.Map<java.lang.String, org.tensorflow.proto.example.FeatureConfiguration> values) {
      internalGetMutableFeatureMap().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.ExampleParserConfiguration)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ExampleParserConfiguration)
  private static final org.tensorflow.proto.example.ExampleParserConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.example.ExampleParserConfiguration();
  }

  public static org.tensorflow.proto.example.ExampleParserConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExampleParserConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<ExampleParserConfiguration>() {
    @java.lang.Override
    public ExampleParserConfiguration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExampleParserConfiguration(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExampleParserConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExampleParserConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.example.ExampleParserConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

