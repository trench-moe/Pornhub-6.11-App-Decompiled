package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lc.d;
import lc.e;
import mc.b;
import qb.n;

/* loaded from: classes.dex */
public class a implements HeartBeatInfo {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f8043b = 0;

    /* renamed from: a  reason: collision with root package name */
    public b<e> f8044a;

    public a(final Context context, Set<d> set) {
        n nVar = new n(new b() { // from class: lc.b
            @Override // mc.b
            public final Object get() {
                e eVar;
                Context context2 = context;
                e eVar2 = e.f12777b;
                synchronized (e.class) {
                    if (e.f12777b == null) {
                        e.f12777b = new e(context2);
                    }
                    eVar = e.f12777b;
                }
                return eVar;
            }
        });
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: lc.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i10 = com.google.firebase.heartbeatinfo.a.f8043b;
                return new Thread(runnable, "heartbeat-information-executor");
            }
        });
        this.f8044a = nVar;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public HeartBeatInfo.HeartBeat a(String str) {
        boolean a10;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a11 = this.f8044a.get().a(str, currentTimeMillis);
        e eVar = this.f8044a.get();
        synchronized (eVar) {
            a10 = eVar.a("fire-global", currentTimeMillis);
        }
        return (a11 && a10) ? HeartBeatInfo.HeartBeat.COMBINED : a10 ? HeartBeatInfo.HeartBeat.GLOBAL : a11 ? HeartBeatInfo.HeartBeat.SDK : HeartBeatInfo.HeartBeat.NONE;
    }
}
