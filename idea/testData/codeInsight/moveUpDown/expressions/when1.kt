// MOVE: down

fun foo(x: Boolean) {
    <caret>// test
    when (x) {
        false -> {

        }
        true -> {

        }
        else -> {

        }
    }
}
