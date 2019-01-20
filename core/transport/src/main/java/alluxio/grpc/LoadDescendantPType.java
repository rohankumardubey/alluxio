// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/fscommon.proto

package alluxio.grpc;

/**
 * Protobuf enum {@code alluxio.grpc.fscommon.LoadDescendantPType}
 */
public enum LoadDescendantPType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <code>ONE = 1;</code>
   */
  ONE(1),
  /**
   * <code>ALL = 2;</code>
   */
  ALL(2),
  ;

  /**
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <code>ONE = 1;</code>
   */
  public static final int ONE_VALUE = 1;
  /**
   * <code>ALL = 2;</code>
   */
  public static final int ALL_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LoadDescendantPType valueOf(int value) {
    return forNumber(value);
  }

  public static LoadDescendantPType forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return ONE;
      case 2: return ALL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LoadDescendantPType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LoadDescendantPType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LoadDescendantPType>() {
          public LoadDescendantPType findValueByNumber(int number) {
            return LoadDescendantPType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return alluxio.grpc.FsCommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final LoadDescendantPType[] VALUES = values();

  public static LoadDescendantPType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LoadDescendantPType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alluxio.grpc.fscommon.LoadDescendantPType)
}

