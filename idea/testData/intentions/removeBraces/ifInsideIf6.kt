fun foo(i :Int) {}

fun test(i: Int, b: Boolean) {
    if (i == 1) {
        if (b) foo(1)
    } else {<caret>
        if (b) foo(2)
    }
}