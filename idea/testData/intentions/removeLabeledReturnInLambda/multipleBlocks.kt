// WITH_RUNTIME

fun foo() {
    listOf(1,2,3).find {
        if (it > 0) {
            return@find <caret>true
        } else {
            false
        }
    }
}