package com.effective.android.service.skin


interface SkinSdk {

    fun getSkins(): List<Skin>

    fun changeSkin(skin: Skin)

    fun addSkinChangeListener(skinChangeListener: SkinChangeListener)

    fun removeSkinChangeListener(skinChangeListener: SkinChangeListener)
}
