// "Replace scope function with safe (?.) call" "true"
// WITH_RUNTIME
fun foo(a: String?) {
    val b = a
            .let {
                it<caret>.length
            }
}