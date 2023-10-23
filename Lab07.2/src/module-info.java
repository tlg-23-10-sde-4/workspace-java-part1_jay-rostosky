/*
 * A module is a collection of related packages.
 * Those packages are not listed here, they are simply the ones that live here together.
 *  com.entertainment
 *  com.entertainment.util
 */
module com.entertainment {
    // which of my *packages* are "exposed" to other Java modules?
    exports com.entertainment;
}