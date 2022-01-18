interface Factory {
    operator fun invoke(i: Int): IntPredicate

    companion object {
        inline operator fun invoke(crossinline f: (Int) -> IntPredicate) = object : Factory {
            override fun invoke(i: Int) = f(i)
        }
    }
}

<selection>fun foo(): Factory = Factory.Companion { k -> IntPredicate { n -> n % k == 0 } }</selection>