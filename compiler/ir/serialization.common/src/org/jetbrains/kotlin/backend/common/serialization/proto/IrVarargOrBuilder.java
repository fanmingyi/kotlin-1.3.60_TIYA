// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrVarargOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrVararg)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex element_type = 1;</code>
   */
  boolean hasElementType();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex element_type = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getElementType();

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrVarargElement element = 2;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrVarargElement> 
      getElementList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrVarargElement element = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrVarargElement getElement(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrVarargElement element = 2;</code>
   */
  int getElementCount();
}