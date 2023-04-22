package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class c implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0087a interfaceC0087a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.f6884a = interfaceC0087a.b(context, str);
        int a10 = interfaceC0087a.a(context, str, true);
        bVar.f6885b = a10;
        int i10 = bVar.f6884a;
        if (i10 == 0) {
            if (a10 == 0) {
                bVar.f6886c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (i10 >= a10) {
            bVar.f6886c = -1;
        } else {
            bVar.f6886c = 1;
        }
        return bVar;
    }
}
