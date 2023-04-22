package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

@Deprecated
/* loaded from: classes.dex */
final class ac {

    /* loaded from: classes.dex */
    public static final class a implements ServiceConnection {
        public final LinkedBlockingQueue<IBinder> AFInAppEventParameterName;
        public boolean AFInAppEventType;

        private a() {
            this.AFInAppEventParameterName = new LinkedBlockingQueue<>(1);
            this.AFInAppEventType = false;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventParameterName.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements IInterface {
        private final IBinder AFInAppEventParameterName;

        public b(IBinder iBinder) {
            this.AFInAppEventParameterName = iBinder;
        }

        public final boolean AFKeystoreWrapper() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                obtain.writeInt(1);
                this.AFInAppEventParameterName.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z10 = false;
                }
                obtain2.recycle();
                obtain.recycle();
                return z10;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFInAppEventParameterName;
        }

        public final String values() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFInAppEventParameterName.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final String AFInAppEventParameterName;
        private final boolean AFInAppEventType;

        public c(String str, boolean z10) {
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = z10;
        }

        public final boolean valueOf() {
            return this.AFInAppEventType;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static com.appsflyer.internal.ac.c AFInAppEventParameterName(android.content.Context r9) {
        /*
            android.os.Looper r6 = android.os.Looper.myLooper()
            r0 = r6
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r1 = r6
            if (r0 == r1) goto L96
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            android.content.pm.PackageManager r6 = r9.getPackageManager()
            r0 = r6
            java.lang.String r1 = "com.android.vending"
            r8 = 6
            r6 = 0
            r2 = r6
            r0.getPackageInfo(r1, r2)
            com.appsflyer.internal.ac$a r0 = new com.appsflyer.internal.ac$a
            r8 = 2
            r0.<init>(r2)
            android.content.Intent r1 = new android.content.Intent
            r7 = 3
            java.lang.String r6 = "com.google.android.gms.ads.identifier.service.STARS"
            r2 = r6
            r1.<init>(r2)
            r8 = 6
            java.lang.String r6 = "com.google.android.gms"
            r2 = r6
            r1.setPackage(r2)
            r2 = 1
            r7 = 2
            boolean r1 = r9.bindService(r1, r0, r2)     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L83
            com.appsflyer.internal.ac$b r1 = new com.appsflyer.internal.ac$b     // Catch: java.lang.Throwable -> L91
            boolean r3 = r0.AFInAppEventType     // Catch: java.lang.Throwable -> L91
            r8 = 1
            if (r3 != 0) goto L7a
            r7 = 3
            r0.AFInAppEventType = r2     // Catch: java.lang.Throwable -> L91
            r8 = 1
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r2 = r0.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L91
            r7 = 5
            r3 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L91
            java.lang.Object r2 = r2.poll(r3, r5)     // Catch: java.lang.Throwable -> L91
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L6c
            r7 = 5
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L91
            com.appsflyer.internal.ac$c r2 = new com.appsflyer.internal.ac$c     // Catch: java.lang.Throwable -> L91
            r8 = 7
            java.lang.String r6 = r1.values()     // Catch: java.lang.Throwable -> L91
            r3 = r6
            boolean r6 = r1.AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L91
            r1 = r6
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L91
            r9.unbindService(r0)
            r7 = 6
            return r2
        L6c:
            r8 = 6
            r8 = 6
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L91
            r8 = 6
            java.lang.String r2 = "Timed out waiting for the service connection"
            r8 = 5
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L91
            r8 = 3
            throw r1     // Catch: java.lang.Throwable -> L91
            r8 = 5
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r6 = "Cannot call get on this connection more than once"
            r2 = r6
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L91
            throw r1     // Catch: java.lang.Throwable -> L91
        L83:
            r9.unbindService(r0)
            r7 = 5
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Google Play connection failed"
            r8 = 2
            r9.<init>(r0)
            throw r9
            r7 = 7
        L91:
            r1 = move-exception
            r9.unbindService(r0)
            throw r1
        L96:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r8 = 6
            java.lang.String r6 = "Cannot be called from the main thread"
            r0 = r6
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ac.AFInAppEventParameterName(android.content.Context):com.appsflyer.internal.ac$c");
    }
}
