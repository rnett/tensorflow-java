// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/device_properties.proto

package org.tensorflow.proto.framework;

public final class DevicePropertiesProtos {
  private DevicePropertiesProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DeviceProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DeviceProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DeviceProperties_EnvironmentEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DeviceProperties_EnvironmentEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NamedDevice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_NamedDevice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0tensorflow/core/protobuf/device_proper" +
      "ties.proto\022\ntensorflow\"\220\003\n\020DevicePropert" +
      "ies\022\014\n\004type\030\001 \001(\t\022\016\n\006vendor\030\002 \001(\t\022\r\n\005mod" +
      "el\030\003 \001(\t\022\021\n\tfrequency\030\004 \001(\003\022\021\n\tnum_cores" +
      "\030\005 \001(\003\022B\n\013environment\030\006 \003(\0132-.tensorflow" +
      ".DeviceProperties.EnvironmentEntry\022\025\n\rnu" +
      "m_registers\030\007 \001(\003\022\025\n\rl1_cache_size\030\010 \001(\003" +
      "\022\025\n\rl2_cache_size\030\t \001(\003\022\025\n\rl3_cache_size" +
      "\030\n \001(\003\022-\n%shared_memory_size_per_multipr" +
      "ocessor\030\013 \001(\003\022\023\n\013memory_size\030\014 \001(\003\022\021\n\tba" +
      "ndwidth\030\r \001(\003\0322\n\020EnvironmentEntry\022\013\n\003key" +
      "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"M\n\013NamedDevice" +
      "\022\014\n\004name\030\001 \001(\t\0220\n\nproperties\030\002 \001(\0132\034.ten" +
      "sorflow.DevicePropertiesB\224\001\n\036org.tensorf" +
      "low.proto.frameworkB\026DevicePropertiesPro" +
      "tosP\001ZUgithub.com/tensorflow/tensorflow/" +
      "tensorflow/go/core/protobuf/for_core_pro" +
      "tos_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_DeviceProperties_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_DeviceProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DeviceProperties_descriptor,
        new java.lang.String[] { "Type", "Vendor", "Model", "Frequency", "NumCores", "Environment", "NumRegisters", "L1CacheSize", "L2CacheSize", "L3CacheSize", "SharedMemorySizePerMultiprocessor", "MemorySize", "Bandwidth", });
    internal_static_tensorflow_DeviceProperties_EnvironmentEntry_descriptor =
      internal_static_tensorflow_DeviceProperties_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_DeviceProperties_EnvironmentEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DeviceProperties_EnvironmentEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_NamedDevice_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_NamedDevice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_NamedDevice_descriptor,
        new java.lang.String[] { "Name", "Properties", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
