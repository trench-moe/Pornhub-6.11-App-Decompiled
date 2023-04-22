package dd;

import android.view.View;
import com.mixpanel.android.mpmetrics.InAppNotification;

/* loaded from: classes.dex */
public class c implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ cd.b f8913c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ InAppNotification f8914f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f8915j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f8916m;

    public c(d dVar, cd.b bVar, InAppNotification inAppNotification, int i10) {
        this.f8916m = dVar;
        this.f8913c = bVar;
        this.f8914f = inAppNotification;
        this.f8915j = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r9) {
        /*
            r8 = this;
            cd.b r9 = r8.f8913c
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.String r9 = r9.f4031t
            java.lang.String r5 = "MixpanelAPI.TakeoverInAppActivity"
            r0 = r5
            r1 = 0
            if (r9 == 0) goto L52
            r6 = 3
            int r5 = r9.length()
            r2 = r5
            if (r2 <= 0) goto L52
            r6 = 2
            android.net.Uri r5 = android.net.Uri.parse(r9)     // Catch: java.lang.IllegalArgumentException -> L49
            r2 = r5
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L2b
            r7 = 5
            java.lang.String r5 = "android.intent.action.VIEW"
            r4 = r5
            r3.<init>(r4, r2)     // Catch: android.content.ActivityNotFoundException -> L2b
            r6 = 2
            dd.d r2 = r8.f8916m     // Catch: android.content.ActivityNotFoundException -> L2b
            r7 = 4
            r2.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2b
            goto L32
        L2b:
            java.lang.String r5 = "User doesn't have an activity for notification URI"
            r2 = r5
            cb.e.O(r0, r2)
            r6 = 2
        L32:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L42
            r6 = 3
            r2.<init>()     // Catch: org.json.JSONException -> L42
            r6 = 1
            java.lang.String r5 = "url"
            r1 = r5
            r2.put(r1, r9)     // Catch: org.json.JSONException -> L41
            r1 = r2
            goto L53
        L41:
            r1 = r2
        L42:
            java.lang.String r5 = "Can't put url into json properties"
            r9 = r5
            cb.e.B(r0, r9)
            goto L53
        L49:
            r9 = move-exception
            java.lang.String r5 = "Can't parse notification URI, will not take any action"
            r1 = r5
            cb.e.N(r0, r1, r9)
            r6 = 6
            return
        L52:
            r7 = 6
        L53:
            com.mixpanel.android.mpmetrics.InAppNotification r9 = r8.f8914f
            com.mixpanel.android.mpmetrics.r r9 = (com.mixpanel.android.mpmetrics.r) r9
            r6 = 3
            java.util.ArrayList<cd.b> r9 = r9.B
            int r5 = r9.size()
            r9 = r5
            r2 = 2
            if (r9 != r2) goto L6c
            r7 = 4
            int r9 = r8.f8915j
            if (r9 != 0) goto L6c
            r6 = 1
            java.lang.String r5 = "secondary"
            r9 = r5
            goto L70
        L6c:
            r7 = 1
            java.lang.String r5 = "primary"
            r9 = r5
        L70:
            if (r1 != 0) goto L79
            r6 = 4
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L81
            r2.<init>()     // Catch: org.json.JSONException -> L81
            r1 = r2
        L79:
            r6 = 6
            java.lang.String r5 = "button"
            r2 = r5
            r1.put(r2, r9)     // Catch: org.json.JSONException -> L81
            goto L88
        L81:
            java.lang.String r5 = "Can't put button type into json properties"
            r9 = r5
            cb.e.B(r0, r9)
            r6 = 5
        L88:
            dd.d r9 = r8.f8916m
            com.mixpanel.android.mpmetrics.k r9 = r9.f8917c
            r6 = 4
            com.mixpanel.android.mpmetrics.k$e r9 = r9.f8277e
            r7 = 7
            com.mixpanel.android.mpmetrics.InAppNotification r0 = r8.f8914f
            r6 = 7
            java.lang.String r2 = "$campaign_open"
            r9.i(r2, r0, r1)
            r7 = 6
            dd.d r9 = r8.f8916m
            r9.finish()
            dd.d r9 = r8.f8916m
            int r9 = r9.f8919j
            r7 = 6
            com.mixpanel.android.mpmetrics.s.d(r9)
            r6 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.c.onClick(android.view.View):void");
    }
}
