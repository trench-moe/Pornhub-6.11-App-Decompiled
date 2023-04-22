package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kc.d;
import ob.a;
import ob.b;
import qb.b;
import qb.c;
import qb.f;
import qb.l;
import w9.a2;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements f {
    public static a lambda$getComponents$0(c cVar) {
        mb.c cVar2 = (mb.c) cVar.a(mb.c.class);
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        Objects.requireNonNull(cVar2, "null reference");
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(dVar, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (b.f13630c == null) {
            synchronized (b.class) {
                if (b.f13630c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar2.g()) {
                        dVar.a(mb.a.class, new Executor() { // from class: ob.d
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new kc.b() { // from class: ob.c
                            @Override // kc.b
                            public final void a(kc.a aVar) {
                                Objects.requireNonNull(aVar);
                                Objects.requireNonNull(null);
                                throw null;
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar2.f());
                    }
                    b.f13630c = new b(a2.j(context, null, null, null, bundle).f17060b);
                }
            }
        }
        return b.f13630c;
    }

    @Override // qb.f
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<qb.b<?>> getComponents() {
        b.C0250b a10 = qb.b.a(a.class);
        a10.a(new l(mb.c.class, 1, 0));
        a10.a(new l(Context.class, 1, 0));
        a10.a(new l(d.class, 1, 0));
        a10.d(mb.a.f13058u);
        a10.c();
        return Arrays.asList(a10.b(), sc.f.a("fire-analytics", "20.1.0"));
    }
}
