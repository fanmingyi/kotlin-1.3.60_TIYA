// "Change function signature..." "true"
// ERROR: Class 'B' is not abstract and does not implement abstract member public abstract fun f(a: String): Unit defined in A
interface A {
    fun f(a: Int)
    fun f(a: String)
}

class B : A {
    <caret>override fun f() {}
}
