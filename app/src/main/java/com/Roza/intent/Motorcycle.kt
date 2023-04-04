package com.Roza.intent

import android.os.Parcel
import android.os.Parcelable

data class Motorcycle (
    val merk : String?,
    val tahun : Int,
    val plat : String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(merk)
        parcel.writeInt(tahun)
        parcel.writeString(plat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Motorcycle> {
        override fun createFromParcel(parcel: Parcel): Motorcycle {
            return Motorcycle(parcel)
        }

        override fun newArray(size: Int): Array<Motorcycle?> {
            return arrayOfNulls(size)
        }
    }
}