package p8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzfr;
import java.util.HashMap;
import java.util.Objects;

@TargetApi(14)
/* loaded from: classes2.dex */
public final class l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f13851c;

    public l(c cVar) {
        this.f13851c = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        String canonicalName;
        for (a0 a0Var : this.f13851c.f13832g) {
            if (a0Var.f13822b == 0) {
                Objects.requireNonNull((r3.c) a0Var.zzC());
                if (SystemClock.elapsedRealtime() >= Math.max(1000L, a0Var.f13823c) + a0Var.f13824e) {
                    a0Var.d = true;
                }
            }
            a0Var.f13822b++;
            if (a0Var.f13821a) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    i iVar = a0Var.f13825f;
                    Uri data = intent.getData();
                    Objects.requireNonNull(iVar);
                    if (data != null && !data.isOpaque()) {
                        String queryParameter = data.getQueryParameter("referrer");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            String valueOf = String.valueOf(queryParameter);
                            Uri parse = Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?"));
                            String queryParameter2 = parse.getQueryParameter("utm_id");
                            if (queryParameter2 != null) {
                                iVar.f13839b.put("&ci", queryParameter2);
                            }
                            String queryParameter3 = parse.getQueryParameter("anid");
                            if (queryParameter3 != null) {
                                iVar.f13839b.put("&anid", queryParameter3);
                            }
                            String queryParameter4 = parse.getQueryParameter("utm_campaign");
                            if (queryParameter4 != null) {
                                iVar.f13839b.put("&cn", queryParameter4);
                            }
                            String queryParameter5 = parse.getQueryParameter("utm_content");
                            if (queryParameter5 != null) {
                                iVar.f13839b.put("&cc", queryParameter5);
                            }
                            String queryParameter6 = parse.getQueryParameter("utm_medium");
                            if (queryParameter6 != null) {
                                iVar.f13839b.put("&cm", queryParameter6);
                            }
                            String queryParameter7 = parse.getQueryParameter("utm_source");
                            if (queryParameter7 != null) {
                                iVar.f13839b.put("&cs", queryParameter7);
                            }
                            String queryParameter8 = parse.getQueryParameter("utm_term");
                            if (queryParameter8 != null) {
                                iVar.f13839b.put("&ck", queryParameter8);
                            }
                            String queryParameter9 = parse.getQueryParameter("dclid");
                            if (queryParameter9 != null) {
                                iVar.f13839b.put("&dclid", queryParameter9);
                            }
                            String queryParameter10 = parse.getQueryParameter("gclid");
                            if (queryParameter10 != null) {
                                iVar.f13839b.put("&gclid", queryParameter10);
                            }
                            String queryParameter11 = parse.getQueryParameter("aclid");
                            if (queryParameter11 != null) {
                                iVar.f13839b.put("&aclid", queryParameter11);
                            }
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                i iVar2 = a0Var.f13825f;
                zzfr zzfrVar = iVar2.f13842f;
                if (zzfrVar != null) {
                    canonicalName = activity.getClass().getCanonicalName();
                    String str = zzfrVar.zzg.get(canonicalName);
                    if (str != null) {
                        canonicalName = str;
                    }
                } else {
                    canonicalName = activity.getClass().getCanonicalName();
                }
                iVar2.d("&cd", canonicalName);
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    Intent intent2 = activity.getIntent();
                    String str2 = null;
                    if (intent2 != null) {
                        String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            str2 = stringExtra;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("&dr", str2);
                    }
                }
                a0Var.f13825f.c(hashMap);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        for (a0 a0Var : this.f13851c.f13832g) {
            int i10 = a0Var.f13822b - 1;
            a0Var.f13822b = i10;
            int max = Math.max(0, i10);
            a0Var.f13822b = max;
            if (max == 0) {
                Objects.requireNonNull((r3.c) a0Var.zzC());
                a0Var.f13824e = SystemClock.elapsedRealtime();
            }
        }
    }
}
