// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/sasl_server.proto

package alluxio.grpc;

/**
 * Protobuf enum {@code alluxio.grpc.sasl.ChannelAuthenticationScheme}
 */
public enum ChannelAuthenticationScheme
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOSASL = 0;</code>
   */
  NOSASL(0),
  /**
   * <code>SIMPLE = 1;</code>
   */
  SIMPLE(1),
  /**
   * <code>CUSTOM = 2;</code>
   */
  CUSTOM(2),
  ;

  /**
   * <code>NOSASL = 0;</code>
   */
  public static final int NOSASL_VALUE = 0;
  /**
   * <code>SIMPLE = 1;</code>
   */
  public static final int SIMPLE_VALUE = 1;
  /**
   * <code>CUSTOM = 2;</code>
   */
  public static final int CUSTOM_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ChannelAuthenticationScheme valueOf(int value) {
    return forNumber(value);
  }

  public static ChannelAuthenticationScheme forNumber(int value) {
    switch (value) {
      case 0: return NOSASL;
      case 1: return SIMPLE;
      case 2: return CUSTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChannelAuthenticationScheme>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChannelAuthenticationScheme> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChannelAuthenticationScheme>() {
          public ChannelAuthenticationScheme findValueByNumber(int number) {
            return ChannelAuthenticationScheme.forNumber(number);
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
    return alluxio.grpc.AuthenticationServerProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ChannelAuthenticationScheme[] VALUES = values();

  public static ChannelAuthenticationScheme valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ChannelAuthenticationScheme(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alluxio.grpc.sasl.ChannelAuthenticationScheme)
}
