// "Replace with 'New'" "true"
package ppp

@Deprecated("", ReplaceWith("NewClass"))
class OldClass(p: Int)

@Deprecated("", ReplaceWith("New"))
typealias Old = OldClass

class NewClass(p: Int)
typealias New = NewClass

fun foo() {
    <caret>Old(1)
}
