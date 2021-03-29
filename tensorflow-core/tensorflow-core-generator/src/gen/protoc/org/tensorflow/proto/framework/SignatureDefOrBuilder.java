// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/meta_graph.proto

package org.tensorflow.proto.framework;

public interface SignatureDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SignatureDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Named input parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; inputs = 1;</code>
   */
  int getInputsCount();
  /**
   * <pre>
   * Named input parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; inputs = 1;</code>
   */
  boolean containsInputs(
      java.lang.String key);
  /**
   * Use {@link #getInputsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.proto.framework.TensorInfo>
  getInputs();
  /**
   * <pre>
   * Named input parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; inputs = 1;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.proto.framework.TensorInfo>
  getInputsMap();
  /**
   * <pre>
   * Named input parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; inputs = 1;</code>
   */

  org.tensorflow.proto.framework.TensorInfo getInputsOrDefault(
      java.lang.String key,
      org.tensorflow.proto.framework.TensorInfo defaultValue);
  /**
   * <pre>
   * Named input parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; inputs = 1;</code>
   */

  org.tensorflow.proto.framework.TensorInfo getInputsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Named output parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; outputs = 2;</code>
   */
  int getOutputsCount();
  /**
   * <pre>
   * Named output parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; outputs = 2;</code>
   */
  boolean containsOutputs(
      java.lang.String key);
  /**
   * Use {@link #getOutputsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.proto.framework.TensorInfo>
  getOutputs();
  /**
   * <pre>
   * Named output parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; outputs = 2;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.proto.framework.TensorInfo>
  getOutputsMap();
  /**
   * <pre>
   * Named output parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; outputs = 2;</code>
   */

  org.tensorflow.proto.framework.TensorInfo getOutputsOrDefault(
      java.lang.String key,
      org.tensorflow.proto.framework.TensorInfo defaultValue);
  /**
   * <pre>
   * Named output parameters.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.TensorInfo&gt; outputs = 2;</code>
   */

  org.tensorflow.proto.framework.TensorInfo getOutputsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Extensible method_name information enabling third-party users to mark a
   * SignatureDef as supporting a particular method. This enables producers and
   * consumers of SignatureDefs, e.g. a model definition library and a serving
   * library to have a clear hand-off regarding the semantics of a computation.
   * Note that multiple SignatureDefs in a single MetaGraphDef may have the same
   * method_name. This is commonly used to support multi-headed computation,
   * where a single graph computation may return multiple results.
   * </pre>
   *
   * <code>string method_name = 3;</code>
   */
  java.lang.String getMethodName();
  /**
   * <pre>
   * Extensible method_name information enabling third-party users to mark a
   * SignatureDef as supporting a particular method. This enables producers and
   * consumers of SignatureDefs, e.g. a model definition library and a serving
   * library to have a clear hand-off regarding the semantics of a computation.
   * Note that multiple SignatureDefs in a single MetaGraphDef may have the same
   * method_name. This is commonly used to support multi-headed computation,
   * where a single graph computation may return multiple results.
   * </pre>
   *
   * <code>string method_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getMethodNameBytes();
}
