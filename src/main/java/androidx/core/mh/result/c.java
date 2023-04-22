package androidx.core.mh.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.mh.ComponentActivity;
import androidx.core.mh.result.d;
import b0.c;
import c.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c<I> {
    public void a(@SuppressLint({"UnknownNullness"}) I i10) {
        d.a aVar = (d.a) this;
        d.this.f1864e.add(aVar.f1868a);
        Integer num = d.this.f1863c.get(aVar.f1868a);
        d dVar = d.this;
        int intValue = num != null ? num.intValue() : aVar.f1869b;
        c.a aVar2 = aVar.f1870c;
        ComponentActivity.b bVar = (ComponentActivity.b) dVar;
        ComponentActivity componentActivity = ComponentActivity.this;
        a.C0046a b10 = aVar2.b(componentActivity, i10);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new androidx.core.mh.d(bVar, intValue, b10));
            return;
        }
        Intent a10 = aVar2.a(componentActivity, i10);
        Bundle bundle = null;
        if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
            a10.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                int i11 = b0.c.f3386b;
                componentActivity.startActivityForResult(a10, intValue, bundle2);
                return;
            }
            f fVar = (f) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = fVar.f1873c;
                Intent intent = fVar.f1874f;
                int i12 = fVar.f1875j;
                int i13 = fVar.f1876m;
                int i14 = b0.c.f3386b;
                componentActivity.startIntentSenderForResult(intentSender, intValue, intent, i12, i13, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new androidx.core.mh.e(bVar, intValue, e10));
                return;
            }
        }
        String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        int i15 = b0.c.f3386b;
        for (String str : stringArrayExtra) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(android.support.v4.media.b.m(a1.a.m("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (componentActivity instanceof c.b) {
                ((c.b) componentActivity).a(intValue);
            }
            componentActivity.requestPermissions(stringArrayExtra, intValue);
        } else if (componentActivity instanceof c.a) {
            new Handler(Looper.getMainLooper()).post(new b0.a(stringArrayExtra, componentActivity, intValue));
        }
    }

    public abstract void b();
}
