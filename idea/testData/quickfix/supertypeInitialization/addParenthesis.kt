// "Change to constructor invocation" "true"
// ERROR: No value passed for parameter 'x'
open class A(x : Int) {}
class B : A<caret> {}
