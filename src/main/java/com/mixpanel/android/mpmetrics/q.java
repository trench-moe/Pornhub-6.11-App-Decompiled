package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8304a = Executors.newSingleThreadExecutor();

    /* loaded from: classes.dex */
    public static class a implements Callable<SharedPreferences> {

        /* renamed from: c  reason: collision with root package name */
        public final Context f8305c;

        /* renamed from: f  reason: collision with root package name */
        public final String f8306f;

        /* renamed from: j  reason: collision with root package name */
        public final b f8307j;

        public a(Context context, String str, b bVar) {
            this.f8305c = context;
            this.f8306f = str;
            this.f8307j = bVar;
        }

        @Override // java.util.concurrent.Callable
        public SharedPreferences call() {
            SharedPreferences sharedPreferences = this.f8305c.getSharedPreferences(this.f8306f, 0);
            b bVar = this.f8307j;
            if (bVar != null) {
                j jVar = (j) bVar;
                Integer num = cd.f.f4055p;
                String string = sharedPreferences.getString("people_distinct_id", null);
                if (string != null) {
                    k.b(jVar.f8269a, string);
                }
            }
            return sharedPreferences;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public Future<SharedPreferences> a(Context context, String str, b bVar) {
        FutureTask futureTask = new FutureTask(new a(context, str, bVar));
        this.f8304a.execute(futureTask);
        return futureTask;
    }
}
