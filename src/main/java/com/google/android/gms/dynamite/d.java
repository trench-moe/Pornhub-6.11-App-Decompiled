package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class d implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0087a interfaceC0087a) {
        int a10;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b10 = interfaceC0087a.b(context, str);
        bVar.f6884a = b10;
        int i10 = 0;
        if (b10 != 0) {
            a10 = interfaceC0087a.a(context, str, false);
            bVar.f6885b = a10;
        } else {
            a10 = interfaceC0087a.a(context, str, true);
            bVar.f6885b = a10;
        }
        int i11 = bVar.f6884a;
        if (i11 != 0) {
            i10 = i11;
        } else if (a10 == 0) {
            bVar.f6886c = 0;
            return bVar;
        }
        if (i10 >= a10) {
            bVar.f6886c = -1;
        } else {
            bVar.f6886c = 1;
        }
        return bVar;
    }
}
