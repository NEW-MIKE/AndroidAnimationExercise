package home.smart.fly.animations.utils.gif.internal

/**
 * @author rookie
 * @since 07-06-2019
 */
data class ResFrame(var fps: Int, var path: String) : Comparable<String> {
    override fun compareTo(other: String): Int {
        return other.compareTo(path)
    }
}