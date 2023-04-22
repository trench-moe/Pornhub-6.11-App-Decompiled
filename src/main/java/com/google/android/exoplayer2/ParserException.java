package com.google.android.exoplayer2;

import java.io.IOException;

/* loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.contentIsMalformed = z10;
        this.dataType = i10;
    }

    public static ParserException a(String str, Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, false, 1);
    }
}
