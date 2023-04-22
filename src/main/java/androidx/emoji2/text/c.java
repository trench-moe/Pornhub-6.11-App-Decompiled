package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw null;
        }

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.emoji2.text.c.a
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.a
        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* renamed from: androidx.emoji2.text.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0025c extends b {
        @Override // androidx.emoji2.text.c.a
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.emoji2.text.j a(android.content.Context r12) {
        /*
            r8 = r12
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r10 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r10 = 28
            r1 = r10
            if (r0 < r1) goto L11
            r10 = 3
            androidx.emoji2.text.c$c r0 = new androidx.emoji2.text.c$c
            r0.<init>()
            goto L16
        L11:
            androidx.emoji2.text.c$b r0 = new androidx.emoji2.text.c$b
            r0.<init>()
        L16:
            android.content.pm.PackageManager r11 = r8.getPackageManager()
            r1 = r11
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            cb.e.u(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r11 = 1
            r2.<init>(r3)
            r3 = 0
            r10 = 2
            java.util.List r10 = r0.c(r1, r2, r3)
            r2 = r10
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r4 = r2.hasNext()
            r5 = 0
            r11 = 6
            if (r4 == 0) goto L5d
            r10 = 2
            java.lang.Object r10 = r2.next()
            r4 = r10
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            r11 = 3
            android.content.pm.ProviderInfo r4 = r0.a(r4)
            r10 = 1
            r6 = r10
            if (r4 == 0) goto L58
            android.content.pm.ApplicationInfo r7 = r4.applicationInfo
            if (r7 == 0) goto L58
            int r7 = r7.flags
            r11 = 4
            r7 = r7 & r6
            r10 = 1
            if (r7 != r6) goto L58
            goto L59
        L58:
            r6 = 0
        L59:
            if (r6 == 0) goto L33
            r10 = 1
            goto L5e
        L5d:
            r4 = r5
        L5e:
            if (r4 != 0) goto L62
            r10 = 5
            goto L97
        L62:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r10 = 6
            android.content.pm.Signature[] r10 = r0.b(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r0 = r10
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r11 = 7
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r11 = 2
        L74:
            if (r3 >= r6) goto L83
            r11 = 2
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            int r3 = r3 + 1
            goto L74
        L83:
            r11 = 3
            java.util.List r10 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r0 = r10
            j0.e r1 = new j0.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            goto L98
        L91:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L97:
            r1 = r5
        L98:
            if (r1 != 0) goto L9b
            goto La0
        L9b:
            androidx.emoji2.text.j r5 = new androidx.emoji2.text.j
            r5.<init>(r8, r1)
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.c.a(android.content.Context):androidx.emoji2.text.j");
    }
}
