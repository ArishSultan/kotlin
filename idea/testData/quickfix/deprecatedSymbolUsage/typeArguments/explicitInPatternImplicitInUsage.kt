// "Replace with 'newFun()'" "true"
// COMPILER_ARGUMENTS: -XXLanguage:-NewInference

@Deprecated("", ReplaceWith("newFun<T>()"))
fun <T : Any> oldFun(): T? {
    return newFun<T>()
}

fun <T : Any> newFun(): T? = null

fun foo(): String? {
    return <caret>oldFun()
}
