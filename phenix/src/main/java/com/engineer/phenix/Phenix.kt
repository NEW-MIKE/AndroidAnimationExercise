package com.engineer.phenix

import android.content.Context
import com.engineer.phenix.bean.ImageBean

/**
 *
 * @author: rookie
 * @date: 2018-07-22 21:07
 * @version V1.0
 */

class Phenix {

    private lateinit var context: Context
    private lateinit var datas:MutableList<ImageBean>

    private constructor()

    companion object {
        fun getInstance ():Phenix {
            return Holder.INSTANCE
        }
    }

    private object Holder {
        val INSTANCE  = Phenix()
    }

    public fun with(context: Context): Phenix {
        this.context = context
        return this
    }

    public fun load(datas:MutableList<ImageBean>): ParamBuilder{
        this.datas = datas
        return ParamBuilder(this.context,datas)
    }

    public fun getDatas():List<ImageBean>{
        return datas
    }

}