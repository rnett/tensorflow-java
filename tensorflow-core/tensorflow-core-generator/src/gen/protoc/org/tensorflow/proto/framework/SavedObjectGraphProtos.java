// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/saved_object_graph.proto

package org.tensorflow.proto.framework;

public final class SavedObjectGraphProtos {
  private SavedObjectGraphProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObjectGraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObjectGraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObject_SaveableObjectsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObject_SaveableObjectsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedUserObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedUserObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedConcreteFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedConcreteFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedBareConcreteFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedBareConcreteFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedConstant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedVariable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SaveableObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SaveableObject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1tensorflow/core/protobuf/saved_object_" +
      "graph.proto\022\ntensorflow\032,tensorflow/core" +
      "/framework/tensor_shape.proto\032%tensorflo" +
      "w/core/framework/types.proto\032(tensorflow" +
      "/core/framework/variable.proto\032(tensorfl" +
      "ow/core/framework/versions.proto\032%tensor" +
      "flow/core/protobuf/struct.proto\0325tensorf" +
      "low/core/protobuf/trackable_object_graph" +
      ".proto\"\350\001\n\020SavedObjectGraph\022&\n\005nodes\030\001 \003" +
      "(\0132\027.tensorflow.SavedObject\022O\n\022concrete_" +
      "functions\030\002 \003(\01323.tensorflow.SavedObject" +
      "Graph.ConcreteFunctionsEntry\032[\n\026Concrete" +
      "FunctionsEntry\022\013\n\003key\030\001 \001(\t\0220\n\005value\030\002 \001" +
      "(\0132!.tensorflow.SavedConcreteFunction:\0028" +
      "\001\"\331\005\n\013SavedObject\022R\n\010children\030\001 \003(\0132@.te" +
      "nsorflow.TrackableObjectGraph.TrackableO" +
      "bject.ObjectReference\022^\n\016slot_variables\030" +
      "\003 \003(\0132F.tensorflow.TrackableObjectGraph." +
      "TrackableObject.SlotVariableReference\0222\n" +
      "\013user_object\030\004 \001(\0132\033.tensorflow.SavedUse" +
      "rObjectH\000\022\'\n\005asset\030\005 \001(\0132\026.tensorflow.Sa" +
      "vedAssetH\000\022-\n\010function\030\006 \001(\0132\031.tensorflo" +
      "w.SavedFunctionH\000\022-\n\010variable\030\007 \001(\0132\031.te" +
      "nsorflow.SavedVariableH\000\022G\n\026bare_concret" +
      "e_function\030\010 \001(\0132%.tensorflow.SavedBareC" +
      "oncreteFunctionH\000\022-\n\010constant\030\t \001(\0132\031.te" +
      "nsorflow.SavedConstantH\000\022-\n\010resource\030\n \001" +
      "(\0132\031.tensorflow.SavedResourceH\000\022F\n\020savea" +
      "ble_objects\030\013 \003(\0132,.tensorflow.SavedObje" +
      "ct.SaveableObjectsEntry\032R\n\024SaveableObjec" +
      "tsEntry\022\013\n\003key\030\001 \001(\t\022)\n\005value\030\002 \001(\0132\032.te" +
      "nsorflow.SaveableObject:\0028\001B\006\n\004kindJ\004\010\002\020" +
      "\003R\nattributes\"`\n\017SavedUserObject\022\022\n\niden" +
      "tifier\030\001 \001(\t\022\'\n\007version\030\002 \001(\0132\026.tensorfl" +
      "ow.VersionDef\022\020\n\010metadata\030\003 \001(\t\"*\n\nSaved" +
      "Asset\022\034\n\024asset_file_def_index\030\001 \001(\005\"\\\n\rS" +
      "avedFunction\022\032\n\022concrete_functions\030\001 \003(\t" +
      "\022/\n\rfunction_spec\030\002 \001(\0132\030.tensorflow.Fun" +
      "ctionSpec\"\250\001\n\025SavedConcreteFunction\022\024\n\014b" +
      "ound_inputs\030\002 \003(\005\022B\n\035canonicalized_input" +
      "_signature\030\003 \001(\0132\033.tensorflow.Structured" +
      "Value\0225\n\020output_signature\030\004 \001(\0132\033.tensor" +
      "flow.StructuredValue\"\255\001\n\031SavedBareConcre" +
      "teFunction\022\036\n\026concrete_function_name\030\001 \001" +
      "(\t\022\031\n\021argument_keywords\030\002 \003(\t\022$\n\034allowed" +
      "_positional_arguments\030\003 \001(\003\022/\n\rfunction_" +
      "spec\030\004 \001(\0132\030.tensorflow.FunctionSpec\"\"\n\r" +
      "SavedConstant\022\021\n\toperation\030\001 \001(\t\"\327\002\n\rSav" +
      "edVariable\022#\n\005dtype\030\001 \001(\0162\024.tensorflow.D" +
      "ataType\022+\n\005shape\030\002 \001(\0132\034.tensorflow.Tens" +
      "orShapeProto\022\021\n\ttrainable\030\003 \001(\010\022<\n\017synch" +
      "ronization\030\004 \001(\0162#.tensorflow.VariableSy" +
      "nchronization\0224\n\013aggregation\030\005 \001(\0162\037.ten" +
      "sorflow.VariableAggregation\022\014\n\004name\030\006 \001(" +
      "\t\022\016\n\006device\030\007 \001(\t\022O\n,experimental_distri" +
      "buted_variable_components\030\010 \003(\0132\031.tensor" +
      "flow.SavedVariable\"\226\002\n\014FunctionSpec\0220\n\013f" +
      "ullargspec\030\001 \001(\0132\033.tensorflow.Structured" +
      "Value\022\021\n\tis_method\030\002 \001(\010\0224\n\017input_signat" +
      "ure\030\005 \001(\0132\033.tensorflow.StructuredValue\022J" +
      "\n\024experimental_compile\030\006 \001(\0162,.tensorflo" +
      "w.FunctionSpec.ExperimentalCompile\"3\n\023Ex" +
      "perimentalCompile\022\013\n\007DEFAULT\020\000\022\006\n\002ON\020\001\022\007" +
      "\n\003OFF\020\002J\004\010\003\020\004J\004\010\004\020\005\"\037\n\rSavedResource\022\016\n\006" +
      "device\030\001 \001(\t\"A\n\016SaveableObject\022\025\n\rsave_f" +
      "unction\030\002 \001(\005\022\030\n\020restore_function\030\003 \001(\005B" +
      "\224\001\n\036org.tensorflow.proto.frameworkB\026Save" +
      "dObjectGraphProtosP\001ZUgithub.com/tensorf" +
      "low/tensorflow/tensorflow/go/core/protob" +
      "uf/for_core_protos_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.proto.framework.TypesProtos.getDescriptor(),
          org.tensorflow.proto.framework.VariableProtos.getDescriptor(),
          org.tensorflow.proto.framework.VersionsProtos.getDescriptor(),
          org.tensorflow.proto.framework.StructProtos.getDescriptor(),
          org.tensorflow.proto.framework.TrackableObjectGraphProtos.getDescriptor(),
        });
    internal_static_tensorflow_SavedObjectGraph_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_SavedObjectGraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObjectGraph_descriptor,
        new java.lang.String[] { "Nodes", "ConcreteFunctions", });
    internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_descriptor =
      internal_static_tensorflow_SavedObjectGraph_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_SavedObject_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_SavedObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObject_descriptor,
        new java.lang.String[] { "Children", "SlotVariables", "UserObject", "Asset", "Function", "Variable", "BareConcreteFunction", "Constant", "Resource", "SaveableObjects", "Kind", });
    internal_static_tensorflow_SavedObject_SaveableObjectsEntry_descriptor =
      internal_static_tensorflow_SavedObject_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_SavedObject_SaveableObjectsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObject_SaveableObjectsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_SavedUserObject_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_SavedUserObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedUserObject_descriptor,
        new java.lang.String[] { "Identifier", "Version", "Metadata", });
    internal_static_tensorflow_SavedAsset_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_SavedAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedAsset_descriptor,
        new java.lang.String[] { "AssetFileDefIndex", });
    internal_static_tensorflow_SavedFunction_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_SavedFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedFunction_descriptor,
        new java.lang.String[] { "ConcreteFunctions", "FunctionSpec", });
    internal_static_tensorflow_SavedConcreteFunction_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_SavedConcreteFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedConcreteFunction_descriptor,
        new java.lang.String[] { "BoundInputs", "CanonicalizedInputSignature", "OutputSignature", });
    internal_static_tensorflow_SavedBareConcreteFunction_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_SavedBareConcreteFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedBareConcreteFunction_descriptor,
        new java.lang.String[] { "ConcreteFunctionName", "ArgumentKeywords", "AllowedPositionalArguments", "FunctionSpec", });
    internal_static_tensorflow_SavedConstant_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_SavedConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedConstant_descriptor,
        new java.lang.String[] { "Operation", });
    internal_static_tensorflow_SavedVariable_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_SavedVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedVariable_descriptor,
        new java.lang.String[] { "Dtype", "Shape", "Trainable", "Synchronization", "Aggregation", "Name", "Device", "ExperimentalDistributedVariableComponents", });
    internal_static_tensorflow_FunctionSpec_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_FunctionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionSpec_descriptor,
        new java.lang.String[] { "Fullargspec", "IsMethod", "InputSignature", "ExperimentalCompile", });
    internal_static_tensorflow_SavedResource_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tensorflow_SavedResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedResource_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_tensorflow_SaveableObject_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tensorflow_SaveableObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SaveableObject_descriptor,
        new java.lang.String[] { "SaveFunction", "RestoreFunction", });
    org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.proto.framework.TypesProtos.getDescriptor();
    org.tensorflow.proto.framework.VariableProtos.getDescriptor();
    org.tensorflow.proto.framework.VersionsProtos.getDescriptor();
    org.tensorflow.proto.framework.StructProtos.getDescriptor();
    org.tensorflow.proto.framework.TrackableObjectGraphProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
