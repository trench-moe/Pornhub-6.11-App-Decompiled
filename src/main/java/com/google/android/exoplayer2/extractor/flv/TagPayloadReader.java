package com.google.android.exoplayer2.extractor.flv;

import c7.w;
import com.google.android.exoplayer2.ParserException;
import k8.t;

/* loaded from: classes.dex */
public abstract class TagPayloadReader {

    /* renamed from: a  reason: collision with root package name */
    public final w f6199a;

    /* loaded from: classes.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(w wVar) {
        this.f6199a = wVar;
    }

    public final boolean a(t tVar, long j10) {
        return b(tVar) && c(tVar, j10);
    }

    public abstract boolean b(t tVar);

    public abstract boolean c(t tVar, long j10);
}
