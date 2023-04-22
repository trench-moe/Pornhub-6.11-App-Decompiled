package ed;

/* loaded from: classes.dex */
public class c implements Runnable {
    public c(com.mixpanel.android.util.a aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0001, B:5:0x0017, B:7:0x001d, B:9:0x0024, B:14:0x0033, B:16:0x0038), top: B:20:0x0001 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r6 = this;
            r3 = r6
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.String r0 = "api.mixpanel.com"
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Exception -> L41
            java.lang.String r5 = "decide.mixpanel.com"
            r1 = r5
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r1)     // Catch: java.lang.Exception -> L41
            r1 = r5
            boolean r2 = r0.isLoopbackAddress()     // Catch: java.lang.Exception -> L41
            if (r2 != 0) goto L31
            boolean r0 = r0.isAnyLocalAddress()     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L31
            r5 = 1
            boolean r0 = r1.isLoopbackAddress()     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L31
            r5 = 4
            boolean r0 = r1.isAnyLocalAddress()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L2d
            r5 = 4
            goto L31
        L2d:
            r5 = 2
            r5 = 0
            r0 = r5
            goto L33
        L31:
            r5 = 1
            r0 = r5
        L33:
            com.mixpanel.android.util.a.f8329a = r0     // Catch: java.lang.Exception -> L41
            r5 = 7
            if (r0 == 0) goto L41
            java.lang.String r5 = "MixpanelAPI.Message"
            r0 = r5
            java.lang.String r5 = "AdBlocker is enabled. Won't be able to use Mixpanel services."
            r1 = r5
            cb.e.h0(r0, r1)     // Catch: java.lang.Exception -> L41
        L41:
            r5 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.c.run():void");
    }
}
