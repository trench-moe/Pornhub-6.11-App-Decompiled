package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import j6.b;
import m6.c;
import m6.f;
import m6.k;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements c {
    @Override // m6.c
    public k create(f fVar) {
        return new b(fVar.a(), fVar.d(), fVar.c());
    }
}
