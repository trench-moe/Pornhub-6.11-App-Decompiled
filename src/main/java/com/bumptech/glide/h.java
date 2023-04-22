package com.bumptech.glide;

import com.bumptech.glide.h;

/* loaded from: classes.dex */
public abstract class h<CHILD extends h<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public final CHILD a() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Object clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
