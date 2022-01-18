/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("UArraysKt")
@file:kotlin.jvm.JvmPackageName("kotlin.collections.unsigned")

package kotlin.collections

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.ranges.contains
import kotlin.ranges.reversed

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public actual inline fun UIntArray.elementAt(index: Int): UInt {
    return get(index)
}

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public actual inline fun ULongArray.elementAt(index: Int): ULong {
    return get(index)
}

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public actual inline fun UByteArray.elementAt(index: Int): UByte {
    return get(index)
}

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public actual inline fun UShortArray.elementAt(index: Int): UShort {
    return get(index)
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UIntArray.asList(): List<UInt> {
    return object : AbstractList<UInt>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: UInt): Boolean = this@asList.contains(element)
        override fun get(index: Int): UInt = this@asList[index]
        override fun indexOf(element: UInt): Int = this@asList.indexOf(element)
        override fun lastIndexOf(element: UInt): Int = this@asList.lastIndexOf(element)
    }
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun ULongArray.asList(): List<ULong> {
    return object : AbstractList<ULong>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: ULong): Boolean = this@asList.contains(element)
        override fun get(index: Int): ULong = this@asList[index]
        override fun indexOf(element: ULong): Int = this@asList.indexOf(element)
        override fun lastIndexOf(element: ULong): Int = this@asList.lastIndexOf(element)
    }
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UByteArray.asList(): List<UByte> {
    return object : AbstractList<UByte>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: UByte): Boolean = this@asList.contains(element)
        override fun get(index: Int): UByte = this@asList[index]
        override fun indexOf(element: UByte): Int = this@asList.indexOf(element)
        override fun lastIndexOf(element: UByte): Int = this@asList.lastIndexOf(element)
    }
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UShortArray.asList(): List<UShort> {
    return object : AbstractList<UShort>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: UShort): Boolean = this@asList.contains(element)
        override fun get(index: Int): UShort = this@asList[index]
        override fun indexOf(element: UShort): Int = this@asList.indexOf(element)
        override fun lastIndexOf(element: UShort): Int = this@asList.lastIndexOf(element)
    }
}

/**
 * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
 * The array is expected to be sorted, otherwise the result is undefined.
 * 
 * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
 * 
 * @return the index of the element, if it is contained in the array within the specified range;
 * otherwise, the inverted insertion point `(-insertion point - 1)`.
 * The insertion point is defined as the index at which the element should be inserted,
 * so that the array (or the specified subrange of array) still remains sorted.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.binarySearch(element: UInt, fromIndex: Int = 0, toIndex: Int = size): Int {
    AbstractList.checkRangeIndexes(fromIndex, toIndex, size)
    val signedElement = element.toInt()
    var low = fromIndex
    var high = toIndex - 1
    while (low <= high) {
        val mid = (low + high).ushr(1) // safe from overflows
        val midVal = storage[mid]
        val cmp = uintCompare(midVal, signedElement)
        if (cmp < 0)
            low = mid + 1
        else if (cmp > 0)
            high = mid - 1
        else
            return mid // key found
    }
    return -(low + 1)  // key not found
}

/**
 * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
 * The array is expected to be sorted, otherwise the result is undefined.
 * 
 * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
 * 
 * @return the index of the element, if it is contained in the array within the specified range;
 * otherwise, the inverted insertion point `(-insertion point - 1)`.
 * The insertion point is defined as the index at which the element should be inserted,
 * so that the array (or the specified subrange of array) still remains sorted.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.binarySearch(element: ULong, fromIndex: Int = 0, toIndex: Int = size): Int {
    AbstractList.checkRangeIndexes(fromIndex, toIndex, size)
    val signedElement = element.toLong()
    var low = fromIndex
    var high = toIndex - 1
    while (low <= high) {
        val mid = (low + high).ushr(1) // safe from overflows
        val midVal = storage[mid]
        val cmp = ulongCompare(midVal, signedElement)
        if (cmp < 0)
            low = mid + 1
        else if (cmp > 0)
            high = mid - 1
        else
            return mid // key found
    }
    return -(low + 1)  // key not found
}

/**
 * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
 * The array is expected to be sorted, otherwise the result is undefined.
 * 
 * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
 * 
 * @return the index of the element, if it is contained in the array within the specified range;
 * otherwise, the inverted insertion point `(-insertion point - 1)`.
 * The insertion point is defined as the index at which the element should be inserted,
 * so that the array (or the specified subrange of array) still remains sorted.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.binarySearch(element: UByte, fromIndex: Int = 0, toIndex: Int = size): Int {
    AbstractList.checkRangeIndexes(fromIndex, toIndex, size)
    val signedElement = element.toInt()
    var low = fromIndex
    var high = toIndex - 1
    while (low <= high) {
        val mid = (low + high).ushr(1) // safe from overflows
        val midVal = storage[mid]
        val cmp = uintCompare(midVal.toInt(), signedElement)
        if (cmp < 0)
            low = mid + 1
        else if (cmp > 0)
            high = mid - 1
        else
            return mid // key found
    }
    return -(low + 1)  // key not found
}

/**
 * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
 * The array is expected to be sorted, otherwise the result is undefined.
 * 
 * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
 * 
 * @return the index of the element, if it is contained in the array within the specified range;
 * otherwise, the inverted insertion point `(-insertion point - 1)`.
 * The insertion point is defined as the index at which the element should be inserted,
 * so that the array (or the specified subrange of array) still remains sorted.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.binarySearch(element: UShort, fromIndex: Int = 0, toIndex: Int = size): Int {
    AbstractList.checkRangeIndexes(fromIndex, toIndex, size)
    val signedElement = element.toInt()
    var low = fromIndex
    var high = toIndex - 1
    while (low <= high) {
        val mid = (low + high).ushr(1) // safe from overflows
        val midVal = storage[mid]
        val cmp = uintCompare(midVal.toInt(), signedElement)
        if (cmp < 0)
            low = mid + 1
        else if (cmp > 0)
            high = mid - 1
        else
            return mid // key found
    }
    return -(low + 1)  // key not found
}

