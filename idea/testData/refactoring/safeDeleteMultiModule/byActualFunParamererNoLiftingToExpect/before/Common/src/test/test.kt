package test

expect fun foo(n: Int)

fun test() {
    foo(1)
    foo(n = 1)
}