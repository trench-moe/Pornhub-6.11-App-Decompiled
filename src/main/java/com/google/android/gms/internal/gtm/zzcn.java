package com.google.android.gms.internal.gtm;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class zzcn extends zzbs {
    private volatile String zza;
    private Future<String> zzb;

    public zzcn(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r4 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzf() {
        /*
            r10 = this;
            r7 = r10
            java.lang.String r9 = "0"
            r0 = r9
            java.lang.String r9 = "Failed to close clientId writing stream"
            r1 = r9
            java.util.UUID r9 = java.util.UUID.randomUUID()
            r2 = r9
            java.lang.String r2 = r2.toString()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.String r9 = r2.toLowerCase(r3)
            r2 = r9
            p8.w r3 = r7.zzq()     // Catch: java.lang.Exception -> L79
            android.content.Context r3 = r3.f13871a     // Catch: java.lang.Exception -> L79
            h9.o.e(r2)     // Catch: java.lang.Exception -> L79
            java.lang.String r4 = "ClientId should be saved from worker thread"
            h9.o.g(r4)     // Catch: java.lang.Exception -> L79
            r9 = 0
            r4 = r9
            r9 = 5
            java.lang.String r9 = "Storing clientId"
            r5 = r9
            r7.zzP(r5, r2)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L5c
            r9 = 7
            java.lang.String r5 = "gaClientId"
            r9 = 0
            r6 = r9
            java.io.FileOutputStream r4 = r3.openFileOutput(r5, r6)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L5c
            byte[] r3 = r2.getBytes()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L5c
            r4.write(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L5c
            r9 = 7
            r4.close()     // Catch: java.io.IOException -> L45 java.lang.Exception -> L79
            goto L49
        L45:
            r3 = move-exception
            r7.zzK(r1, r3)     // Catch: java.lang.Exception -> L79
        L49:
            return r2
        L4a:
            r2 = move-exception
            goto L6b
        L4c:
            r2 = move-exception
            java.lang.String r9 = "Error writing to clientId file"
            r3 = r9
            r7.zzK(r3, r2)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L6a
        L55:
            r9 = 2
            r4.close()     // Catch: java.io.IOException -> L5a java.lang.Exception -> L79
            goto L6a
        L5a:
            r2 = move-exception
            goto L67
        L5c:
            r2 = move-exception
            java.lang.String r9 = "Error creating clientId file"
            r3 = r9
            r7.zzK(r3, r2)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L6a
            r9 = 1
            goto L55
        L67:
            r7.zzK(r1, r2)     // Catch: java.lang.Exception -> L79
        L6a:
            return r0
        L6b:
            if (r4 == 0) goto L77
            r9 = 5
            r4.close()     // Catch: java.io.IOException -> L72 java.lang.Exception -> L79
            goto L78
        L72:
            r3 = move-exception
            r9 = 4
            r7.zzK(r1, r3)     // Catch: java.lang.Exception -> L79
        L77:
            r9 = 7
        L78:
            throw r2     // Catch: java.lang.Exception -> L79
        L79:
            r1 = move-exception
            java.lang.String r2 = "Error saving clientId file"
            r7.zzK(r2, r1)
            r9 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcn.zzf():java.lang.String");
    }

    public final String zzb() {
        String str;
        zzW();
        synchronized (this) {
            if (this.zza == null) {
                this.zzb = zzq().a(new zzcl(this));
            }
            Future<String> future = this.zzb;
            if (future != null) {
                try {
                    try {
                        this.zza = future.get();
                    } catch (InterruptedException e10) {
                        zzS("ClientId loading or generation was interrupted", e10);
                        this.zza = "0";
                    }
                } catch (ExecutionException e11) {
                    zzK("Failed to load or generate client id", e11);
                    this.zza = "0";
                }
                if (this.zza == null) {
                    this.zza = "0";
                }
                zzP("Loaded clientId", this.zza);
                this.zzb = null;
            }
            str = this.zza;
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|2|3|4|5|6|(1:8)(2:20|(1:22)(5:23|24|25|26|(2:12|13)(2:15|16)))|9|10|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r4 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
        zzK("Failed to close client id reading stream", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x006a: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:20:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzc() {
        /*
            r12 = this;
            java.lang.String r9 = "gaClientId"
            r0 = r9
            java.lang.String r1 = "Failed to close client id reading stream"
            p8.w r2 = r12.zzq()
            android.content.Context r2 = r2.f13871a
            r10 = 6
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            h9.o.g(r3)
            r10 = 2
            r9 = 0
            r3 = r9
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73 java.io.FileNotFoundException -> L90
            r9 = 36
            r5 = r9
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r11 = 4
            r7 = 0
            int r9 = r4.read(r6, r7, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r5 = r9
            int r9 = r4.available()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r8 = r9
            if (r8 <= 0) goto L39
            java.lang.String r9 = "clientId file seems corrupted, deleting it."
            r5 = r9
            r12.zzR(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r11 = 3
            r4.close()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            goto L4b
        L39:
            r9 = 14
            r8 = r9
            if (r5 >= r8) goto L50
            java.lang.String r9 = "clientId file is empty, deleting it."
            r5 = r9
            r12.zzR(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r4.close()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r11 = 3
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
        L4b:
            r10 = 7
            r4.close()     // Catch: java.io.IOException -> L95
            goto L9a
        L50:
            r11 = 5
            r4.close()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r8.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            java.lang.String r9 = "Read client id from disk"
            r5 = r9
            r12.zzP(r5, r8)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c java.io.FileNotFoundException -> L6e
            r4.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r0 = move-exception
            r12.zzK(r1, r0)
        L67:
            r3 = r8
            goto L9a
        L69:
            r0 = move-exception
            r3 = r4
            goto L81
        L6c:
            r5 = move-exception
            goto L75
        L6e:
            r10 = 3
            goto L91
        L71:
            r0 = move-exception
            goto L81
        L73:
            r5 = move-exception
            r4 = r3
        L75:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r11 = 7
            r12.zzK(r6, r5)     // Catch: java.lang.Throwable -> L69
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L9a
            goto L94
        L81:
            if (r3 == 0) goto L8d
            r10 = 3
            r3.close()     // Catch: java.io.IOException -> L88
            goto L8e
        L88:
            r2 = move-exception
            r12.zzK(r1, r2)
            r11 = 2
        L8d:
            r11 = 7
        L8e:
            throw r0
            r10 = 3
        L90:
            r4 = r3
        L91:
            if (r4 == 0) goto L9a
            r11 = 7
        L94:
            goto L4b
        L95:
            r0 = move-exception
            r12.zzK(r1, r0)
            r10 = 2
        L9a:
            if (r3 != 0) goto La2
            r10 = 5
            java.lang.String r0 = r12.zzf()
            return r0
        La2:
            r10 = 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcn.zzc():java.lang.String");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }

    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().a(new zzcm(this));
        }
        return zzb();
    }
}
