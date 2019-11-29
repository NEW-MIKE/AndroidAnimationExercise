package com.engineer.plugin.extensions

import org.gradle.api.Action
import org.gradle.api.model.ObjectFactory

/**
 * @author zhuyongging @ Zhihu Inc.
 * @since 11-29-2019
 */

open class PhoenixExtension(objectFactory: ObjectFactory) {
    var rename: RenameExtension = objectFactory.newInstance(RenameExtension::class.java)
    //
//
    fun rename(action: Action<RenameExtension>) {
        action.execute(rename)
    }
}