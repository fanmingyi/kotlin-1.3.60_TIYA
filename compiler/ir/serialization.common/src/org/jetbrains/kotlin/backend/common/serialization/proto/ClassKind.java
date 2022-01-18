// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf enum {@code org.jetbrains.kotlin.backend.common.serialization.proto.ClassKind}
 */
public enum ClassKind
    implements org.jetbrains.kotlin.protobuf.Internal.EnumLite {
  /**
   * <code>CLASS = 1;</code>
   */
  CLASS(0, 1),
  /**
   * <code>INTERFACE = 2;</code>
   */
  INTERFACE(1, 2),
  /**
   * <code>ENUM_CLASS = 3;</code>
   */
  ENUM_CLASS(2, 3),
  /**
   * <code>ENUM_ENTRY = 4;</code>
   */
  ENUM_ENTRY(3, 4),
  /**
   * <code>ANNOTATION_CLASS = 5;</code>
   */
  ANNOTATION_CLASS(4, 5),
  /**
   * <code>OBJECT = 6;</code>
   */
  OBJECT(5, 6),
  ;

  /**
   * <code>CLASS = 1;</code>
   */
  public static final int CLASS_VALUE = 1;
  /**
   * <code>INTERFACE = 2;</code>
   */
  public static final int INTERFACE_VALUE = 2;
  /**
   * <code>ENUM_CLASS = 3;</code>
   */
  public static final int ENUM_CLASS_VALUE = 3;
  /**
   * <code>ENUM_ENTRY = 4;</code>
   */
  public static final int ENUM_ENTRY_VALUE = 4;
  /**
   * <code>ANNOTATION_CLASS = 5;</code>
   */
  public static final int ANNOTATION_CLASS_VALUE = 5;
  /**
   * <code>OBJECT = 6;</code>
   */
  public static final int OBJECT_VALUE = 6;


  public final int getNumber() { return value; }

  public static ClassKind valueOf(int value) {
    switch (value) {
      case 1: return CLASS;
      case 2: return INTERFACE;
      case 3: return ENUM_CLASS;
      case 4: return ENUM_ENTRY;
      case 5: return ANNOTATION_CLASS;
      case 6: return OBJECT;
      default: return null;
    }
  }

  public static org.jetbrains.kotlin.protobuf.Internal.EnumLiteMap<ClassKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static org.jetbrains.kotlin.protobuf.Internal.EnumLiteMap<ClassKind>
      internalValueMap =
        new org.jetbrains.kotlin.protobuf.Internal.EnumLiteMap<ClassKind>() {
          public ClassKind findValueByNumber(int number) {
            return ClassKind.valueOf(number);
          }
        };

  private final int value;

  private ClassKind(int index, int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:org.jetbrains.kotlin.backend.common.serialization.proto.ClassKind)
}
