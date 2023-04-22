package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class b implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0087a interfaceC0087a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a10 = interfaceC0087a.a(context, str, true);
        bVar.f6885b = a10;
        if (a10 != 0) {
            bVar.f6886c = 1;
        } else {
            int b10 = interfaceC0087a.b(context, str);
            bVar.f6884a = b10;
            if (b10 != 0) {
                bVar.f6886c = -1;
            }
        }
        return bVar;
    }
}
